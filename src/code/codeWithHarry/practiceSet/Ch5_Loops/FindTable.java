package code.codeWithHarry.practiceSet.Ch5_Loops;

import java.util.Scanner;

public class FindTable {
    public static void printTableOf(int N, int start, int end){
        if(start>end){return;}
        int result=N*start;
        System.out.printf("%d x %d = %d%n", N,start,result);
        printTableOf(N, start+1,end);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("Enter number of which table you want: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }
            int N = Integer.parseInt(input);
            printTableOf(N, 1,10);//Enter start and end
            System.out.println("Press enter to stop\nor");
        }
        sc.close();
    }
}
