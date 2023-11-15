package code.codeWithHarry.practiceSet.Ch6_Arrays.ArrayUtils.OneDArrays;
import java.util.Scanner;
public class OneDArrayUtils {
    public static void printArray(int[] array){
        for (int i = 0; i <=(array.length)-1 ; i++) {
            System.out.println("Element at position ["+i+"] is: "+array[i]);
        }
    }
    public static void enterValuesToIntArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=(array.length)-1 ; i++) {
            System.out.println("Enter value at ["+i+"]: ");
            array[i]=sc.nextInt();
        }
        sc.close();
    }

    public static void enterValuesToFloatArray(float[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=(array.length)-1 ; i++) {
            System.out.println("Enter value at ["+i+"]: ");
            array[i]=sc.nextFloat();
        }
        sc.close();
    }
    public static void enterValuesToStringArray(String[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=(array.length)-1 ; i++) {
            System.out.println("Enter value at ["+i+"]: ");
            array[i]=sc.next();
        }
        sc.close();
    }
}
