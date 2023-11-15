package code.codeWithHarry.lecPracs.Ch3_Strings;
import java.util.Scanner;
public class Lec14_StringMethods {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String k= "Kalpak";
        String h= new String("Harry");
//        System.out.println(k.length());
//        System.out.println(k.toLowerCase());
//        System.out.println(k.toUpperCase());
//        String k2="     Kalpak        ";
//        System.out.println(k2);
//        System.out.println(k2.trim());

//        System.out.println(k.substring(1));// this method will print the string from the specified index to end
//        System.out.println(k.substring(0));// call to substring is redundant
//        System.out.println(k.substring(3,6));// here we have specified start and end to tell it from where to where we need characters
//
//        System.out.println(h.replace('r','p'));
//        System.out.println(h.replace("rry","ier"));
//        System.out.println(h.replace("r","ier"));
//
//        System.out.println(h.startsWith("Har"));//true
//        System.out.println(h.startsWith("Pr"));//false
//        System.out.println(h.endsWith("Har"));
//        System.out.println(h.endsWith("ry"));

//        System.out.println(k.charAt(5));
//
//        System.out.println(k.indexOf("ak"));

        String modifiedName="Harryrryrry";
        System.out.println(modifiedName.indexOf("rry4545"));//-1 is returned if not found
        System.out.println(modifiedName.indexOf("rry",4));

        System.out.println(modifiedName.lastIndexOf("y"));//It'll start searching from end

        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(k.equals("Kalpak"));
        System.out.println(k.equals("kalpak"));
        System.out.println(k.equalsIgnoreCase("kalPak"));//This will ignore upper/lower case

        //Escape sequence characters
        System.out.println("I am \"escape sequence\"");
        System.out.println("I am \\escape sequence\\");
        System.out.println("I \tam \n\"escape sequence\"");
        cin.close();
    }
}
