package code.codeWithHarry.practiceSet.Ch1_basic1;

import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers to add: ");
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        Addition ad = new Addition(a,b,c);
        System.out.println("The sum is: "+ad.calculateSum());
    }
}
class Addition{
    private float a,b,c;
    public Addition(float num1, float num2, float num3){
        this.a=num1;
        this.b=num2;
        this.c=num3;
    }
    public float calculateSum(){
        return a+b+c;
    }
}
