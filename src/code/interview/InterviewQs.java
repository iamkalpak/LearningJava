package code.interview;

import java.util.Scanner;

public class InterviewQs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 1: Adding 2 numbers without using '+'
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        //Remember window handles for selenium
        /*
        Company: Gainsight
        Problem statement: I have opened 40 windows in chrome how can I close 39 and keep one window open

        */

        sc.close();
    }
    public static int addNumbers(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
