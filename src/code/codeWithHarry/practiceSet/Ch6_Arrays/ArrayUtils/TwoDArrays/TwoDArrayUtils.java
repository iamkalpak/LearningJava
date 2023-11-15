package code.codeWithHarry.practiceSet.Ch6_Arrays.ArrayUtils.TwoDArrays;

public class TwoDArrayUtils {
    public static void printMatrix(int[][] array){
        //matrix representation
        for (int i = 0; i <= (array.length)-1; i++) {
            for (int j = 0; j <= (array[i].length)-1; j++) {
//                System.out.println("Element at position matrix["+i+"]["+j+"]: "+matrix[i][j]);
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void print2DArray(int[][] array){
        for (int i = 0; i <= (array.length)-1; i++) {
            for (int j = 0; j <= (array[i].length)-1; j++) {
                System.out.println("Element at position ["+i+"]["+j+"]: "+array[i][j]);
            }
        }
    }
}
