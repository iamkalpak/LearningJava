package code.codeWithHarry.practiceSet.Ch5_Loops;
public class NaturalNum100to200 {
    public static void main(String[] args) {
        printNaturalNumbers(100,200);
    }

    //Recurssion
    public static void printNaturalNumbers(int start, int end){
        if(start>end){
            return;
        }
        System.out.println(start);
        printNaturalNumbers(start+1,end);
    }
}
