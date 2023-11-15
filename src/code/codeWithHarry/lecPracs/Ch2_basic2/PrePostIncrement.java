package code.codeWithHarry.lecPracs.Ch2_basic2;

public class PrePostIncrement {
    public static void main(String[] args) {
        int x=10;//assigned 10 to x
        System.out.println(x++);//x=10 --> x=11
        System.out.println(++x);//x was 11 now pre increment makes it 12 then assigns it to x so x=12
        System.out.println(x--);//now x is 12 it assigns to x and then decrements it to 11
        System.out.println(--x);//10
    }
}