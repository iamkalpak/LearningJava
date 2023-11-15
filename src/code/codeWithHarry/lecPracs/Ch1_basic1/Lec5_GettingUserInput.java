package code.codeWithHarry.lecPracs.Ch1_basic1;
import java.util.Scanner;//imported scanner class
public class Lec5_GettingUserInput {
	//CGPA to percentage converter
	private double cgpa,percentage=0;
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public double getPercentage() {
		return percentage;
	}
	public void calculatePercentage() {
		this.percentage = ((7.1 * cgpa) + 11);
	}

	public static void main(String[] args) {
		Lec5_GettingUserInput obj = new Lec5_GettingUserInput();//object of class to access its methods
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter CGPA: ");
		double cgpa = sc.nextDouble();

		obj.setCgpa(cgpa); // Set the CGPA value
		obj.calculatePercentage(); // Calculate the percentage

		System.out.println("Entered CGPA is: " + obj.getCgpa());
		System.out.println("Percentage of the following CGPA as per University of Mumbai is: " + obj.getPercentage()+"%");

		sc.close();
    }
}
