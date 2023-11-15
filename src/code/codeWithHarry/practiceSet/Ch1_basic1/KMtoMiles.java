package code.codeWithHarry.practiceSet.Ch1_basic1;

import java.util.Scanner;

public class KMtoMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check if it is int or not: ");
        System.out.println(sc.hasNextInt());
        //Yet to write main function for conversion
    }
}
class convert{
    private double km, mileKerKm=0.621371;
    public void convert(double distance){
        this.km=distance;
    }
    public double convertDistance(){
        return km*mileKerKm;
    }
}
