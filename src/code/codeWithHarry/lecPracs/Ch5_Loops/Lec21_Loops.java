package code.codeWithHarry.lecPracs.Ch5_Loops;

public class Lec21_Loops {
    //use of return: statement is used to exit a method and return a value (if the method has a non-void return type).
    public static void recurssion(int i){
        if(i>10) {
            return;
        }
        System.out.println(i);
        recurssion(i+1);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result; // Return the sum of a and b
    }

    public static void main(String[] args) {
        int i=0;
        while(i<4){
            System.out.println(i);
            i++;
        }
        System.out.println("------------------------");
        int b=0;
        do{
            System.out.println(b);
            b++;
        }while (b<=3);

        System.out.println("------------------------");
        for (int j = 0; j < 4; j++) {
            System.out.println(j);
        }

        //using rercurssion as a loop
        int k=0;
        recurssion(k);

        //Using infinite loop
//        while(true){
//            System.out.println(m);
//        }

        //use of break:statement is used to terminate the execution of a loop or switch statement.
        for (int g = 0; g < 10; g++) {
            if (g == 5) {
                break; // Exit the loop when g reaches 5
            }
            System.out.println(g);
        }

        //use of continue: statement is used to skip the remaining code in a loop iteration and proceed to the next iteration.
        for (int f = 0; f < 10; f++) {
            if (f % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(f);
        }

        //return
        int a=1,x=2;
        System.out.println(sum(a,x));




    }
}
