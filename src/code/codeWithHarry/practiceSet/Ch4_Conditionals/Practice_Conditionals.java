package code.codeWithHarry.practiceSet.Ch4_Conditionals;
import java.util.Scanner;
public class Practice_Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Problem 1
//        int a=10;
//        if(a==11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");

        //Problem 2
//        System.out.println("Enter marks in Physics: ");
//        float phy=sc.nextFloat();
//        System.out.println("Enter marks in Chemistry: ");
//        float chem=sc.nextFloat();
//        System.out.println("Enter marks in Maths: ");
//        float maths=sc.nextFloat();
//
//        float avg=(phy+chem+maths)/3.0f;
//        System.out.println("Your average is: "+avg);
//
//        if(avg>=40&&phy>=33&&chem>=33&&maths>=33)
//            System.out.println("Congratulations you have been promoted");
//        else
//            System.out.println("Sorry, please try again! Try try till you success");

        //Problem 3
//        float income,tax=0;
//
//        System.out.println("Enter yearly salary: ");
//        income=sc.nextFloat();
//
//        if(income<=2.5f){
//            tax=tax+0;
//        System.out.println("Tax paid by employee is Rs."+tax);}
//        else if(income>2.5f&&income<=5.0f){
//            tax=tax+0.05f*(income-2.5f);
//            System.out.println("Tax paid by employee is Rs."+tax);
//        }
//        else if(income>5f&&income<=10f){
//            tax=tax+0.2f*(5.0f-2.5f);
//            tax=tax+0.2f*(income-2.5f);
//            System.out.println("Tax paid by employee is Rs."+tax);
//        }else if(income>10f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.2f*(10f-5f);
//            tax=tax+0.3f*(income-2.5f);
//            System.out.println("Tax paid by employee is Rs."+tax);
//        }

        //Problem 4
//        System.out.println("Enter day of week: ");
//        byte day=sc.nextByte();
//
//        //New switch case
//        switch(day){
//            case 1 -> {
//                System.out.println("Monday");
//            }
//            case 2 -> {
//                System.out.println("Tuesday");
//            }
//            case 3 -> {
//                System.out.println("Wednesday");
//            }
//            case 4 -> {
//                System.out.println("Thursday");
//            }
//            case 5 -> {
//                System.out.println("Friday");
//            }
//            case 6 -> {
//                System.out.println("Saturday");
//            }
//            case 7 -> {
//                System.out.println("Sunday");
//            }
//            default -> {
//                System.out.println("Invalid number");
//            }
//
//        }
        /*

        //Traditional switch case
        switch (number) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid number";
                break;
        }
        */

        System.out.println("Enter the year: ");
        float year=sc.nextFloat();
        String checker= ((year%4)==0)?"Leap Year":"Not a Leap year";
        System.out.println(checker);

        System.out.println("Enter website url: ");
        String url=sc.next();//because website doesn't contain space

        if (url.endsWith(".org"))
            System.out.println("This is organizational website");
        else if (url.endsWith(".com"))
            System.out.println("This is commercial  website");
        else if (url.endsWith(".in"))
            System.out.println("This is Indian  website");
        else if (url.endsWith(".gov"))
            System.out.println("This is government  website");
        else
            System.out.println("Unknown URL");

        sc.close();
    }
}
