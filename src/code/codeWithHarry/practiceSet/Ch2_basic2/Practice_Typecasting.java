package code.codeWithHarry.practiceSet.Ch2_basic2;

public class Practice_Typecasting {
    public static void main(String[] args) {
//        float a=7/4*9/2; <- 4.0
//        float a=7/4.0f*9/2.0f;
//        System.out.println(a);
        char grade= 'B';
        grade = (char)(grade+8);//<-typecasting //the resultant which will come we are explicitly converting it to char
        // Jo answer chaiye vo character ke type me chaiye that's why typecasting

        System.out.println(grade);

        //Decrypting grade
        grade = (char)(grade-8);
        System.out.println(grade);


    }
}
