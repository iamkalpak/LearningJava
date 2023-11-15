package code.physicsWallahSkills.unordered;

import java.util.Scanner;
public class oddEveDivByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int divisibility = num;
        String checker,checker2;
        checker = (divisibility%3==0)?"It is divisible by 3 and":"It is not divisible by 3 and";
        checker2 = (num%2==0)? "it is an Even number":"it is an Odd number";
        System.out.println(checker+" "+checker2);
    }
}
