package code.codeWithHarry.lecPracs.Ch2_basic2;

public class Lec9_OperatorPrecidence {
    public static void main(String[] args) {
        int a= 6*5-34/2;
        /*
        =30-34/2
        =30-17
        =13
         */
        System.out.println(a);
        //Precedence and associativity
        //One with the higher precedence is evaluated first
        //If both have high precedence then who comes first is checked (first come, first served)<- this is called associativity
        int b= 60/5-34*2;
        /*
        =12=34*2
        =12-68
        =-56
         */
        System.out.println(b);

    }
}
