package code.codeWithHarry.practiceSet.Ch2_basic2;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s_name;
        float obtained_mks, totalMks;
        System.out.println("Enter Name of student: ");
        s_name=sc.nextLine();
        System.out.println("Enter obtained marks: ");
        obtained_mks=sc.nextFloat();
        System.out.println("Enter Total marks: ");
        totalMks=sc.nextFloat();
        calculator c=new calculator(s_name,obtained_mks,totalMks);
        System.out.println(s_name+" got "+c.calculatePercentage()+"%");
        if(c.calculatePercentage()>=60.0&&c.calculatePercentage()<=100.0) System.out.println("Congrulations "+s_name+" for getting 'A' grade");
        else if (c.calculatePercentage()>50.0&&c.calculatePercentage()<60.0) System.out.println("Congrulations "+s_name+" for getting 'B' grade");
        else if (c.calculatePercentage()>=35.0&&c.calculatePercentage()<50.0) System.out.println("Congrulations "+s_name+" for getting 'C' grade");
        else System.out.println("Better luck next time "+s_name+" keep trying...<3 you will definitely succeed");

        sc.close();
    }
}
class calculator{
    private String name;
    private float obtained_mks, totalMks;

    public calculator(String s_name, float obtained_mks,float s_tot){
        this.name=s_name;
        this.obtained_mks=obtained_mks;this.totalMks=s_tot;
    }
    public float calculatePercentage(){
        return ((obtained_mks)/totalMks)*100;
    }






}
