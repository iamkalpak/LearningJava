package code.codeWithHarry.lecPracs.Ch2_basic2;

public class preAndPostIncrementDecrement {
    public static void main(String[] args) {
        int x=10;//assigned 10 to x
        System.out.println(x++);//x=10 --> x=11
        System.out.println(++x);//x was 11 now pre increment makes it 12 then assigns it to x so x=12
        System.out.println(x--);//now x is 12 it assigns to x and then decrements it to 11
        System.out.println(--x);//now x is 11 it decrements it to 10 and then assigns to x so x=10 again


        //Example 2
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
    }
}