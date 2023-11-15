package code.objectOrientedProgramming.AnujBhaiyaJava.practice1.basics;

public class Transformer implements Bike, Human{//Interfaces ke liye 'implements' keyword lagta hai
    public static void main(String[] args) {
        Transformer bumbleBee = new Transformer();
        bumbleBee.start();
        bumbleBee.startWalking();

    }

    @Override//annotation hai usko batate hai ki this fucntion is meant to be overridden
    public void start() {
        System.out.println("My car is starting...");
    }

    @Override
    public void startWalking() {
        System.out.println("Optimus prime is walking.");
        //basically humne ise transformer bana diya jo start bhi ho sakta hai aur chal bhi sakta hai
    }
}
interface Bike{
    //by defult public hote hai/ by default abstract hote hai
    //interfaces ap ko true abstraction provide krte hai
    public abstract void start();//public abstract likhne ka faida nai kyuki by default usko pata hai
}
interface Human{
    void startWalking();
}