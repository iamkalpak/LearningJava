package code.codeWithHarry.lecPracs.Ch1_basic1;
import java.util.Scanner;
public class Lec5_pt2_GettingUserInput {
    //This program calculates percentage enter the obtained marks, total marks
    private double mksObtained, totalMks, percentage=0;
    private String name;
/*

    //Part of value checker
    private boolean checkInput;

    public boolean isCheckInput() {
        return checkInput;
    }

    public void setCheckInput(boolean checkInput) {
        this.checkInput = checkInput;
    }//*/

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getMksObtained() {
        return mksObtained;
    }

    public void setMksObtained(double mksObtained) {
        this.mksObtained = mksObtained;
    }

    public double getTotalMks() {
        return totalMks;
    }

    public void setTotalMks(double totalMks) {
        this.totalMks = totalMks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void calculatePercent() {
        this.percentage = (mksObtained/totalMks)*100;
    }

    public static void main(String[] args) {

        Lec5_pt2_GettingUserInput obj = new Lec5_pt2_GettingUserInput();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name of Student: ");
        //obj.setName(sc.next());//This will only take first name not the surname if we add space after first name
        obj.setName(sc.nextLine());//This will read full name (f_name and l_name)

        System.out.println("Enter obtained marks: ");
        obj.setMksObtained(sc.nextDouble());

        System.out.println("Enter total marks: ");
        obj.setTotalMks(sc.nextDouble());

        obj.calculatePercent();

        System.out.println(obj.getName()+" got " + obj.getPercentage() + "%");//*/
        /*
        //Value checker
        System.out.println("Enter value: ");
        obj.setCheckInput(sc.hasNextInt());
        System.out.println(obj.isCheckInput());//*/

        sc.close();
    }
}
