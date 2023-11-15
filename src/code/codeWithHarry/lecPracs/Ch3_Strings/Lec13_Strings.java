package code.codeWithHarry.lecPracs.Ch3_Strings;

import java.util.Scanner;
public class Lec13_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        String is a sequence of characters
        String is a class but can be used as a datatype
        It is instantiated as follows: String name=new String("Kalpak");

        ***Imp
        Strings are immutable and cannot be changed
        ***

        If you want to change the original string it is not possible(this is meant by immutable)
        you can create its copy and change it, but you cannot change the
        original one
        */
//        String name=new String("Kalpak");
        String name="Kalpak";

        //Printing types
//        System.out.print("The name is: ");
//        System.out.print(name);
//
//        System.out.println("The name is: ");
//        System.out.println(name);

        int a =6;
        float b=5.6445f;
//
//        Output formatting
//        System.out.printf("The value of a is: %d \nThe value of b is: %f",a,b);
        System.out.format("The value of a is: %d \nThe value of b is: %8.2f",a,b);

        //%8.2f <- 8 spaces and rounded off to 2 digits
        /*
        %d -> format specifier
         */

        //Hacker Rank output formatting problem
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n", s1, x);
//
//
//        }
//        System.out.println("================================");
//        String st=sc.next();//<- This will not read white space
//        String st=sc.nextLine();// <- This will read white space
//        System.out.println(st);
        sc.close();
    }
}
