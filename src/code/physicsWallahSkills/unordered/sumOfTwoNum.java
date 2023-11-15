package code.physicsWallahSkills.unordered;

import java.util.Scanner;
public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,sum=0;
        System.out.println("Enter the first number: ");
        num1= sc.nextInt();
        System.out.println("Enter the second number: ");
        num2= sc.nextInt();
        sum=num1+num2;
        System.out.println("The sum is: "+sum);

    }
}
