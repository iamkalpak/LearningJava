package code.objectOrientedProgramming.AnujBhaiyaJava.practice1.ensapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(35000);
        System.out.println(l1.getPrice());
    }

    /*public void doWork(){//Agar public hata diya toh ye function dusro ke liye available nai hoga ye wale package aur iske sub packages me hi available hoga
        System.out.println("working...");
    }*/
    /*void doWork(){//default
        System.out.println("working...");
    }*/
//    private void doWork(){//class ke aandar se hi access kr sakte ho class ke bahar se nai
//        System.out.println("working...");
//    }
    /*************************************************************/
    //private: children ko na mile
    //protected: sirf child class ko milega baki kisi ko nai
    /*************************************************************/
    }

class Laptop{
    private int ram;
    private int price;

    public int getRam(){//getter
        return ram;
    }
    public void setRam(int ram){//setter
        this.ram= ram;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        // is user admin?
        boolean isAdmin =true;
        if (!isAdmin)
            System.out.println("You cannot set price!...Login with admin to change price");
        else
            this.price=price;//System.out.println("Price is: "+price);

        //this.price=price;
    }
}
