package code.nextLeap.javaLearning;

public class Lec2_Variables {
    public static void main(String[] args) {
        // System.out.println(); -> It will first print and then change the line
        // System.out.print(); -> It first print
        // System.out.println("Anything");
        System.out.print("Hello");
        System.out.println("Hello");

        /*
        // Variables are used for storing data
        // - Name, Type and value

        // Rule for creating variables
        // datatype name = valueStoredInVariable;

        // Integer variable created with value 10
        int a = 10;

        float b = 3.75f;
        double c = 10.5;

        // With big number using l/L with long is compulsory
        long d = 1000000000000l;

        char z = 'a';

        String y = "Hello";

        System.out.println(d); // Value of this variable is printed

        // Combine a English Sentence with a variable
        System.out.println("Hello, c = " + c + " @ Welcome !!");

        // Java will treat decimal number by default as double
        // Java will treat integer number by default as int

        // Type -> Data type


        // Data Type - 1
        // int - It is used for storing integer values
        // Range -> -2*10^ 9 to +2*10^9
        // Memory used - 4 byte

        // long - It is used for storing big integer values
        // Range -> -2*10^18 to +2*10^18
        // Memory used - 8 bytes


        -----------------------------------------------------------
        // Data Type - 1
        // int - It is used for storing integer values
        // Range -> -2*10^ 9 to +2*10^9
        // Memory used - 4 byte (32 bits)

        // long - It is used for storing big integer values
        // Range -> -2*10^18 to +2*10^18
        // Memory used - 8 bytes (64 bits)

        // String
        // - Whenever any English sentence or English word needs to stored then we use Strings
        // - " " (Double Quotes)
        // - Lot of interview questions with Big number (10^20)
        // - Memory management for String we will discuss later

        // char
        // - whenever we have a single letter
        // - ' ' (Single Quote is preferred)
        // - Memory Used for char - 2 bytes

        // Float
        // - Used for storing decimal numbers
        // - Memory Used - 4 bytes
        // - Upto 7 digits after decimal point it can easily store
        // - f/F is compulsory with Float

        // Double
        // - Used for storing decimal numbers
        // - Memory Used - 8 bytes
        // - More than 15 digits after the decimal point then we use double

        // Boolean
        // - Used for storing 2 values - true or false
        // - Memory Used - 1 bit
        // 1 bytes = 8 bit
        boolean a = true;

        // short
        // - Used for storing Integer numbers
        // - Memory used - 2 byte
        // - Range-> -32768 to 32627

        // byte
        // - Used for storing Integer number
        // - Memory used - 1 byte
        // - Range-> -128 to 127

        -----------------------------------------------------------

        // RULE for creating object
        // ClassName objectName = new ClassName();

        // Object of Scanner Class
        Scanner in = new Scanner(System.in);

        // new keyword will actually create new object

        // Input numbers from Console

        // Package - Group of class is called package
        // Scanner Class is present inside util package
        // - It is used for Input in Java

        // STEP 1 - To Import Scanner class
        // STEP 2 - To create object of scanner class
        // STEP 3 - Use functionality of Scanner with help of object created in STEP 2

        int a = in.nextInt();

        System.out.println(a);

        ----------------------------------------------------------------------------------


         // RULE for creating object
        // ClassName objectName = new ClassName();

        // Object of Scanner Class
        Scanner in = new Scanner(System.in);

        // new keyword will actually create new object

        // Input numbers from Console

        float c = 1.57f;

        // Package - Group of class is called package
        // Scanner Class is present inside util package
        // - It is used for Input in Java

        // STEP 1 - To Import Scanner class
        // STEP 2 - To create object of scanner class
        // STEP 3 - Use functionality of Scanner with help of object created in STEP 2

        float a = in.nextFloat();

        System.out.println(a);


        ----------------------------------------------------------------------------------------------------

        // RULE for creating object
        // ClassName objectName = new ClassName();

        // Object of Scanner Class
        Scanner in = new Scanner(System.in);

        // new keyword will actually create new object

        // Input numbers from Console

        // Package - Group of class is called package
        // Scanner Class is present inside util package
        // - It is used for Input in Java

        // STEP 1 - To Import Scanner class
        // STEP 2 - To create object of scanner class
        // STEP 3 - Use functionality of Scanner with help of object created in STEP 2

        String a = in.nextLine();

        System.out.println(a);

        -----------------------------------------------------

        // RULE for creating object
        // ClassName objectName = new ClassName();

        // Object of Scanner Class
        Scanner anything = new Scanner(System.in);

        // new keyword will actually create new object

        // Input numbers from Console

        // Package - Group of class is called package
        // Scanner Class is present inside util package
        // - It is used for Input in Java

        // STEP 1 - To Import Scanner class
        // STEP 2 - To create object of scanner class
        // STEP 3 - Use functionality of Scanner with help of object created in STEP 2

        String a = anything.nextLine();

        // System class is not imported Why ?
        // Because why default it is present
        System.out.println(a);

        ----------------------------------------------------------------

        Functionalities of Scanner class - non-static in nature

        We can use that functionality by using OBJECT of the class

        - nextInt() - Input a integer number (int datatype)
        - nextLong() - Input a long integer number (long datatype)

        - nextFloat() - Input a decimal number (float datatype)
        - nextDouble() - Input a decimal number (double datatype)

        - next() - Input a English word (Single word) (String)
        - nextLine() - Input a English Sentence (Multiple words) (String)

        - nextBoolean() - Input 2 values (true or false)

        // Question - Write a whole program where you input two numbers and print the sum (addition)
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		// new keyword help us to create new object in memory
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();

          // LOGIC
		int c = a+b; // + -> Addition operator (It will add numbers)

		System.out.println(c);
	}
}

// Question - Complete the function to add two numbers
class Solution {

    // public - this function is a public property (IT can be used by everyone)
    // there is no word as static no this function is non-static in nature (Object will be required)
    // int (return type is not VOID that is why return statement is must)
    // function name can be anything
    // parameters - What values are given to function as a input is present in parameters
	public int addTwoNumbers(int a, int b) {

		// LOGIC

		// return keyword is used to return some value
		int sum = a + b;

		// Since here return type is not VOID
		return sum;
	}
}

 (Print Two Lines Question)
class Solution {
	public void printTwoLines() {
		System.out.println("Hello there!");
		System.out.println("Let's start");
	}
}

 (Logical Operators)
public class Main
{
	public static void main(String[] args) {

		// AND (&&) -> If both things are true then result is true
		// OR (||) -> If either of things is true then result is true
		// NOT (!) -> Reverse the thing

		boolean a = true;
		boolean b = false;

		// LOGICAL Operators - &&, ||, !

		// !a -> false
		// !b -> true
		// a&&b -> false
		// a||b -> true

		System.out.println(!a);
		System.out.println(!b);
		System.out.println(a&&b);
		System.out.println(a||b);
	}
}

 (Equal To Equal To Operator)
public class Main
{
	public static void main(String[] args) {

		// = (Equal to, Assignment Operator)
		int a = 5;

		// == (Equal to Equal to)
		// If will check if values on LHS and RHS are same or not
		// If will give true when values on LHS and RHS are same
		// If will give false when values on LHS and RHS are not same

		boolean result = a==5;
		// TYPE CASTING (MONDAY class we will discuss why here false is coming)

		System.out.println(result);

	}
}

7th Operator (AND operator Question)
// Write a program that uses the && operator to check if two variables are true
// and returns the result.
class Solution {
	public boolean checkboolean(boolean a, boolean b) {
		// Your code goes here

        // == LHS and RHS are equal or not

        // if first value (a) is true or not
		boolean result1 = a==true;

		// if second value (b) is true or not
		boolean result2 = b==true;

		// We need to return if both are true or not
		return result1 && result2;
	}
}

 (Calculate Area of Circle)
class Solution {
	public double calculateCircleArea(double r) {

	    // Area of circle -> pi * r * r

	    // Whenever we are unsure what value of pi to use
	    // We will use Math.PI (Everytime we will use Math.PI)

	    // Math.PI - 3.141592653589793238

	    // Why 3.14 is not giving correct answer
	    // Because we want more digits after decimal point

	    // Math class is already present we don't have to import it
	    double valueOfPi = Math.PI;

	    double area = valueOfPi * r * r;
	    return area;
	}
}

 (Constraints)

// Constraints:
// They will give the range of input
// Why are they used ?
// - What datatype to select
// - (What approach to use in DSA ?)

 (Integer/ Decimal Concept)
public class Main
{
	public static void main(String[] args) {

	    // CONCEPT -> If numbers are in integers then result will be in integers
	    // If numbers are in double/float then result will be in double/float
	    int a = 5;
	    int b = 9;

	    int c = a/b; // \ (Divide) (5/9 -> 0)

	    double d = a/b;

	    double z = 5.0;
	    double y = 9.0;

	    double x = z/y;

	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(x);


	}
}


 (Basic Operators)
public class Main
{
	public static void main(String[] args) {

	    // CONCEPT -> If numbers are in integers then result will be in integers
	    // If numbers are in double/float then result will be in double/float
	    int a = 9;
	    int b = 5;

	    int c = a+b;
	    int d = a-b;
	    int e = a*b;
	    int f = a/b;
	    int g = a%b; // only on integers

	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	    System.out.println(f);
	    System.out.println(g);
	}
}

 (String to Integer)
class Solution {
	public int stringToInt(String str) {

		// Integer.parseInt("200") -> 200
		// This function is capable to convert String to Integer

		int answer = Integer.parseInt(str);

		return answer;
	}
}

 (String To Boolean)
class Solution {
	public boolean stringToBoolean(String str) {
		boolean answer = Boolean.parseBoolean(str);
		return answer;
	}
}

 (Int to String)
class Solution {
	public String intToString(int num) {

		// Integer to String

		// String.valueOf(200) -> "200"
		// It will take a integer and convert it into string

		String answer = String.valueOf(num);
		return answer;
	}
}

 (Nth Term in AP series)
class Solution {
	public int nthTermInAnAP(int a, int d, int n) {
		// Formula - a + (n-1) * d

		int nthTerm = a + (n-1)*d;
		return nthTerm;
	}
}




 (Relational, Increment/ Decrement Operators)
public class Main
{
	public static void main(String[] args) {

	    int a = 5;
	    int b = 6;
	    int c = 7;
	    int d = 8;

	    a = a + 5; // a += 5;
	    b = b - 10; // b -= 10;
	    c = c * 5; // c *= 5;
	    d = d / 1; // d /= 1;

	    // Relational Operators
	    // <, >, <=, >=, ==
	    // Result is either true or false (boolean data type)
	    // >= It will give true if number is > or equal to the other number

	    // Increment / Decrement Operator
	    // a++ (Post-increment operator) -> First use the value then Increase it
	    // ++a (Prefix-increment operator) -> First increase the value and then use it

        // a-- (Post-increment operator) -> First use the value then Decrease it
	    // --a (Prefix-increment operator) -> First Decrease the value and then use it

         // DISCUSS the working of POST AND PREFIX in next class
	}
}



        */
    }
}
