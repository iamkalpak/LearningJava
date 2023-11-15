package code.codeWithHarry.lecPracs.Ch6_Arrays;
import code.codeWithHarry.practiceSet.Ch6_Arrays.ArrayUtils.TwoDArrays.TwoDArrayUtils;
import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter number of rows: ");
        r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        c=sc.nextInt();
        int [][] matrix= new int[r][c];
        for (int i = 0; i <= (matrix.length)-1; i++) {
            for (int j = 0; j <= (matrix[i].length)-1; j++) {
                System.out.println("Enter element at position matrix["+i+"]["+j+"]: ");
                matrix[i][j]=sc.nextInt();
            }
        }

        //matrix representation
        System.out.println("Printing array in matrix representation Matrix: ");
        TwoDArrayUtils.printMatrix(matrix);

        System.out.println("Printing 2D Array: ");
        TwoDArrayUtils.print2DArray(matrix);
//        for (int i = 0; i <= (matrix.length)-1; i++) {
//            for (int j = 0; j <= (matrix[i].length)-1; j++) {
//                System.out.print(matrix[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        sc.close();
        
    }
}
