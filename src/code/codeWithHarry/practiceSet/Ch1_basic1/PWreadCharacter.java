package code.codeWithHarry.practiceSet.Ch1_basic1;

import java.util.Scanner;
public class PWreadCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(" Character is :"+ch);


    }
}
