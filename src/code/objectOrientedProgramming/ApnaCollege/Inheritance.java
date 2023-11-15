package code.objectOrientedProgramming.ApnaCollege;

//import code.ObjectOrientedProgramming.ApnaCollege.bank;


class Shape{
    public void area(){
        System.out.println("Diaplay area");
    }
}
class Triangle2 extends Shape{
    public void area (int l, int ht){
        System.out.println(((1/2)*l*ht));
    }
}
//class EquilateralTriangle extends Triangle{
//    public void area (int l, int ht){
//        System.out.println(((1/2)*l*ht));
//    }
//}

class Circle extends Shape{
    public void area(float r){
        System.out.println((3.14f)*(r*r));
    }
}
public class Inheritance
{
    public static void main(String[] args) {
        /*
        Packages: are similar to folder
        2 types: 1.built-in, 2.user defined
        example:  Steam folder contains csgo

        */
//        Account account1=new Account();
//        account1.name="cust1";




    }
}
