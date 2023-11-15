package code.physicsWallahSkills.unordered.arrayFunctions;
import java.util.*;
public class arrayFunctions {
    public static void takeArrayInput(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array element at " + i + " position ");
            inputArray[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            System.out.println("The element at " + i + " is: " + printArray[i]);
        }
    }
    /*
    private int lowerNumber=0, higherNunber=0;
    public int getNumber(){
        return lowerNumber, higherNumber;
    }
    public void setValues(int low, int high){
        this.lowernumber=low;
        this.higherNumber=high;

    }
    public int countOdds(int low, int high) {
        Scanner sc = new Scanner(System.in);

    }*/
}
    /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the array element at "+i+" position ");
            arr[i] = sc.nextInt();
        }
        */
        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The element at "+i+" is: "+arr[i]);
        }

        int[] arr2 = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("The element at "+i+" is: "+arr2[i]);
        }*/




    /*static void takeArrayInput(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array element at "+i+" position ");
            inputArray[i] = sc.nextInt();
        }
    }

    static void printArray(int[] printArray){
        for (int i = 0; i < printArray.length; i++) {
            System.out.println("The element at "+i+" is: "+printArray[i]);
        }

    }*/

    //        takeArrayInput(arr);
//        printArray(arr);
//        int[] arr2 = {2,3,4,5,69,82,81};
//        printArray(arr2);

