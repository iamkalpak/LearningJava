package code.codeWithHarry.practiceSet.Ch1_basic1;

import java.util.Scanner;

public class CGPAcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float s1,s2,s3;
        System.out.println("Enter marks of subject 1: ");
        s1= sc.nextFloat();
        s2= sc.nextFloat();
        s3= sc.nextFloat();
        CGPAcalc obj=new CGPAcalc(s1,s2,s3);
        System.out.println("The CGPA is: "+obj.findCGPA());
    }
}

class CGPAcalc{
    private float sub1, sub2, sub3;
    public CGPAcalc(float s1,float s2, float s3){
        this.sub1=s1;
        this.sub2=s2;
        this.sub3=s3;
    }
    public float findCGPA(){
        return (sub1+sub2+sub3)/30;
    }
}
