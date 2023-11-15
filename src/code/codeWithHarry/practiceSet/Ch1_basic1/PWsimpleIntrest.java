package code.codeWithHarry.practiceSet.Ch1_basic1;

import java.util.Scanner;

public class PWsimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        float principle = sc.nextFloat();

        System.out.println("Enter the rate of intrest:");
        float intrest = sc.nextFloat();

        System.out.println("Enter time: ");
        float time = sc.nextFloat();

        float simpleIntrest = (principle*intrest*time)*100;

        System.out.println("If");
        System.out.println("Principle amount is "+principle);
        System.out.println("Rate of intrest is "+intrest+"%");
        System.out.println("Time is "+time);
        System.out.println("Then the simple intrest is "+simpleIntrest);

    }
}
