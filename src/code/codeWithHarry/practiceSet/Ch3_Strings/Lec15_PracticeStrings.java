package code.codeWithHarry.practiceSet.Ch3_Strings;

import java.util.Scanner;

public class Lec15_PracticeStrings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

//        System.out.println("Enter a string: ");
//        String a=sc.nextLine();
//
//        //Problem 1
//        System.out.println(a.toLowerCase());
//        //Problem 2
//        System.out.println(a.replace(" ","_"));
//        //Problem 3
//        String letter ="Dear <name>, Thanks alot!";
        //Problem 4
        String myString="This string contains double  and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


        //Problem 5
        String letter2="\tDear Kalpak,\n\t\tThis Java repo is nice.\n\tThanks!";
        System.out.println(letter2);
        sc.close();
    }
}
