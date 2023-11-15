package code.codeWithHarry.practiceSet.Ch5_Loops;

public class LoopsPractice {
    public static int findFactorial(int n){
//        (n==0||n==1)?return 1:return n*findFactorial(n-1);
        if(n==0||n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
//    public static void findFact(int n){  //Revisit
//        int product =1;
//        if (n == 0 || n == 1) {
//            System.out.println(product);
//            return;
//        } else {
//            product = n *findFact(n - 1);
//
//        }
//        System.out.println(product);
//    }


    public static void main(String[] args) {


        //Odd natural numbers from 100 to 0
//        for (int i=100;i>0;i--){
//            if (i%2!=0)
//                System0.out.println(i);
//            else {continue;}
//        }

        //Print the following pattern
        /*

        ****
        ***
        **
        *

         */
//        int n =5;
//        for (int i=n;i>0;i--){
////            System.out.print("*");
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        //First n even natural numbers
//        int i=0,n=100,sum=0;
//        while (i<=n){
//            if(i%2==0){
//                sum=sum+i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //Multiplication table in reverse order
//        int i=10,n=4, product=0;
//        while(i>0){
//            product=n*i;
//            System.out.printf("%d x %d = %d%n",n,i,product);
//            i--;
//        }

        //Factorial

        //Loop way
//        int n=6, product=1;
//        while(n>0){
//            product=product*n;
//            n--;
//        }
//        System.out.println(product);

        //Functional way to find factorial(resurssion)
//        int num=6;
//        System.out.println(findFactorial(num));

        //To sum numbers appearing in table of 8
        int i=1;
        int sum=0;
        while(i<=10){
            sum += 8*i;
            i++;
        }
        System.out.println(sum);

    }
}
