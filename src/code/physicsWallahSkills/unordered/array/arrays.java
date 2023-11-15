package code.physicsWallahSkills.unordered.array;
import code.physicsWallahSkills.unordered.arrayFunctions.arrayFunctions;// import packageName.className;
import java.util.*;

public class arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        arrayFunctions importedArrPkg = new arrayFunctions();
        System.out.println("Enter Array length: ");
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        importedArrPkg.takeArrayInput(arr);
        importedArrPkg.printArray(arr);

    }
}
