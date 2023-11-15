package code.physicsWallahSkills.unordered;

public class PWoperators {
    public static void unary(){
        //        int p=5,q=5;

//        System.out.println("p:"+ p++);
//        System.out.println("p:"+p);
//
//        System.out.println("q:"+ ++q);
//        System.out.println("q:"+q);

//        int x=p++;
//        int y=++q;
//
//        System.out.println(x);
//        System.out.println(y);
//
//        System.out.println(p);
//        System.out.println(q);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i++);

        }
        System.out.println("**********************");
        for (int i = 0; i <= 10; i++) {
            System.out.println(++i);

        }

        //Unary example 2
        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }

    public static void shiftOperators(){
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240
    }

    public static void arithmetic(){
        int a=10;
        int b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0

        System.out.println(10*10/5+3-1*4/2);
    }

    public static void shiftOps(){
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240


        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        //Example 2
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
    }
    public static void logicalAndBitwiseAnd(){
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);

        //Example 2
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }
    public static void logicalOrBitwiseOr(){
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true
        //|| vs |
        System.out.println(a>b||a++<c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a>b|a++<c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }

    public static void ternary(){
        int a=2;
        int b=5;
        int min=(a<b)?a:b;
        System.out.println(min);

        //Example 2
        int x=10;
        int y=5;
        int min2=(x<y)?x:y;
        System.out.println(min2);
    }

    public static void assignment(){
        int a=10;
        int b=20;
        a+=4;//a=a+4 (a=10+4)
        b-=4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);

        //Example 2
        int x=10;
        x+=3;//10+3
        System.out.println(x);
        x-=4;//13-4
        System.out.println(x);
        x*=2;//9*2
        System.out.println(x);
        x/=2;//18/2
        System.out.println(x);

        //Example 2: Java Assignment Operator Example: Adding short
        short i=10;
        short j=10;
        //i+=j;//i=i+j internally so fine
//        i=i+j;//Compile time error because 10+10=20 now int//uncomment this to see an compile time error
        System.out.println(i);

        //After typecasting
        short a1=10;
        short b1=10;
        a1=(short)(a1+b1);//20 which is int now converted to short
        System.out.println(a1);
    }

    public static void main(String[] args) {
//        unary();
//        shiftOperators();
//        arithmetic();
//        shiftOps();
//        logicalAndBitwiseAnd();
//        logicalOrBitwiseOr();
//        ternary();
//        assignment();


    }
}
