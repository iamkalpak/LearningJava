package code.codeWithHarry.lecPracs.Ch1_basic1;
import java.util.Scanner;
public class Lec2_hw_AddThreeNumbers {
    private static int a,b,c,result=0;
    public static int addNumbers(int a, int b, int c){
        result=a+b+c;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("The sum of 3 integers is: "+addNumbers(a,b,c));
        /*
        * The choice between 'private static int' and 'private int' in Java depends on the specific use case and the behavior you want to achieve in your code. Here are some considerations:

    private static int: A private static int is a static variable that is associated with the class itself, rather than with individual instances of the class. It means that all objects of the class share the same static variable. This can be useful when you want to maintain a single value across all instances of the class or when you need to access the variable without creating an instance of the class.

    private int: A private int is an instance variable that is specific to each object or instance of the class. Each object has its own copy of the variable, and they are independent of each other. Instance variables are accessed and modified through the specific instance of the class.

The choice between the two depends on the behavior you want to achieve in your code. If you need a variable that is shared among all instances of the class or if you want to access the variable without creating an instance, then private static int is appropriate. On the other hand, if you need a separate variable for each instance/object, then private int is suitable.

Consider the purpose and behavior of your code to determine whether to use private static int or private int for your variables. It's important to choose the option that aligns with the design and functionality of your program.
        * */
    }
}
