package code.codeWithHarry.lecPracs.Ch6_Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements;
        System.out.println("Enter no of elements: ");
        elements=sc.nextInt();
        int [] marks= new int[elements];
        for (int i = 0; i <=(marks.length)-1; i++) {//used for loop coz we know the count  of elements
            System.out.println("Enter element "+i+":");
            marks[i]=sc.nextInt();
        }

        //System.out.println(marks.length);//Indexing starts from 0, this length property counts the size of array from 1

        for (int i = 0; i <=(marks.length)-1; i++) {
            System.out.println("Element stored at marks["+i+"] is: "+marks[i]);
        }

        //Quick quiz: Display array in reverse order
        System.out.println("\nPrinting in reverse order: ");
        for (int j = marks.length-1; j>=0; j--) {
            System.out.println("Element stored at marks["+j+"] is: "+marks[j]);
        }

        //for each loop
        for (int ele:marks) {
            System.out.println(ele);
        }




        sc.close();
    }
}
