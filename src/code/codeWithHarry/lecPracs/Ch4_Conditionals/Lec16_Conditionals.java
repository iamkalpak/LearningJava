package code.codeWithHarry.lecPracs.Ch4_Conditionals;

public class Lec16_Conditionals {
    public static void main(String[] args) {
        int age=36;

        //If condition
        if (age>=18)
            System.out.println("Yes you can drive!");//if no braces then only one line will be executed
        else
            System.out.println("No you can't drive");//if no braces then only one line will be executed

        //Nested if : If conditions inside If conditions are known as nested if's
//        if(true){
//            if(true){
//                if (true){}
//            }
//        }
//        else{}

        //If-ElseIf-else
        if(age>18&&age==18){
            System.out.println("You can drive");
        } else if (age!=18||age<18) {
            System.out.println("You cannot drive");
        }
        else{
            //code goes here
        }

        //Ternary operator
        //condition ? value_if_true : value_if_false
        int x = 10;
        int y = 20;

        int max = (x > y) ? x : y;
        System.out.println(max);
    }
}
