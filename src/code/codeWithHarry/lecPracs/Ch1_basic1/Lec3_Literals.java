package code.codeWithHarry.lecPracs.Ch1_basic1;
import java.lang.*;
public class Lec3_Literals {
    public static void main(String[] args) {
        byte age=22;
        int age2= 21;
        short age3=45;
        long ageDino= 23748247245284584L;// L-> use kiya hai usko batane ke liye ki ye long number hai
        char ch = 'K';//''-> char me single quotes literal hai
        float f1= 5.4f;// f-> literal agar f nai likha toh by default vo double lega
        double d1= 3.22;
        boolean a= true;
        String k= "Kalpak";//String literal
        System.out.println("byte: "+age+"\nint: "+age2+"\nshort: "+age3+"\nlong: "+ageDino+"\nchar: "+ch+"\nfloat: "
                +f1+"\ndouble: "+d1+"\nboolean: "+a+"\nString: "+k);
    }
}
