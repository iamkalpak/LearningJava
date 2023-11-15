package code.objectOrientedProgramming.AnujBhaiyaJava.practice1.basics;

public class Abstraction {
    public static void main(String[] args) {
        //Car c1=new Car();// object bana ke faida hi nai jab hume pata hi nai konsi car aane wali hai
        //c1.start();
        Audi a1 = new Audi();
        a1.start();
        BMW b1 = new BMW();
        b1.start();


    }
}
class Audi extends Car{
    @Override//iski implementation mai nai dunga iski implementation vo denge jo isko extend kr rhe honge
    void start() {
        System.out.println("Audi is starting...");
    }
}
class BMW extends Car{
    @Override//iski implementation mai nai dunga iski implementation vo denge jo isko extend kr rhe honge
    //abstract functions ko aap ko override krna hai
    void start() {
        System.out.println("BMW is starting...");
    }
}
abstract class Car{//Yaha 'abstract' add kr diya toh ap iska object nai bana sakte
    //abstract ka children nai bana sakte balki children ko abstract bana sakte hai
    int price;
    String model;
    abstract void start();//isko abstract bol diya toh ap ko iski implemem]ntation batane ki zarurat nai
    // abstract methods ki definition nai hoti
    /*
    void start(){
        System.out.println(model+" is starting...");
    }*/

    void breaks(){//abstract class ke andar ap concrete functions bana sakte ho where as interfaces me ye possible nai hai
        System.out.println("applying breaks...");
    }
}
