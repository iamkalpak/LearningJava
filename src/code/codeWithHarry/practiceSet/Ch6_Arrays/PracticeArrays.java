package code.codeWithHarry.practiceSet.Ch6_Arrays;
import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Problem 1:Sum of float values using array
//        System.out.println("Enter the number of elements you want to store: ");
//        int elements= sc.nextInt();
//        float[] values= new float[elements];
//        float sum=0.0f;
//
//        for (int i = 0; i <=(values.length)-1 ; i++) {
//            System.out.println("Enter float values to sum values["+i+"]: ");
//            values[i]=sc.nextFloat();
//        }
//
//        for (int i = 0; i <=(values.length)-1 ; i++) {
//            sum=sum+values[i];
//        }
//        System.out.println(sum);

        //Problem 2: element present ion array or not
//        System.out.println("Enter the number of elements: ");
//        int elements= sc.nextInt();
//        int [] values =new int[elements];
//
//        //Storing elements in array
//        for (int i = 0; i <=(values.length)-1 ; i++) {
//            System.out.println("Enter Integer values to store in values["+i+"]: ");
//            values[i]=sc.nextInt();
//        }
//
//        System.out.println("Enter the value top compare: ");
//        int compareVal= sc.nextInt();
//        String foundVal = null;
//
//
//        for (int i = 0; i <=(values.length)-1 ; i++) {
//            if(values[i]==compareVal){
//                foundVal= String.valueOf(values[i]);
//                break;
//            }
//            else{
//                continue;
//            }
//        }
//
//        if (foundVal!=null){
//            System.out.println("The value was present at index: "+foundVal);
//        }
//        else {
//            System.out.println("Value not present");
//        }

        //Problem 3: Calculate average marks from array
//        System.out.println("Enter the no. of Physics students: ");
//        int elements= sc.nextInt();
//        float[] values= new float[elements];
//        float sum=0.0f;
//
//        for (int i = 0; i <=(values.length)-1 ; i++) {
//            System.out.println("Enter marks to sum values["+i+"]: ");
//            values[i]=sc.nextFloat();
//        }
//
//        for (int i = 0; i <=(values.length)-1 ; i++) {
//            sum=sum+values[i];
//        }
//        System.out.println("The sum is: "+sum+"\nNumber of Students is: "+values.length);
//        System.out.println("The average is: "+sum/values.length);

        //Problem 4: addition of 2 matrix
//        System.out.println("Enter number of rows: ");
//        int row=sc.nextInt();
//        System.out.println("Enter number of columns: ");
//        int columns= sc.nextInt();
//
//        int [][] mat1 = new int[row][columns];
//        int [][] mat2 = new int[row][columns];
//        int [][] sumMatrix = new int[row][columns];
//
//        for (int i = 0; i <=(mat1.length)-1 ; i++) {
//            for (int j = 0; j <= (mat1[i].length)-1; j++) {
//                System.out.println("Enter value in matrix1[" + i + "][" + j + "]: ");
//                mat1[i][j]= sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i <=(mat2.length)-1 ; i++) {
//            for (int j = 0; j <= (mat2[i].length)-1; j++) {
//                System.out.println("Enter value in matrix2[" + i + "][" + j + "]: ");
//                mat2[i][j]= sc.nextInt();
//            }
//        }
//
//
//        System.out.println("Matrix 1: ");
//        for (int i = 0; i <=(mat1.length)-1 ; i++) {
//            for (int j = 0; j <= (mat1[i].length)-1; j++) {
//                System.out.print(mat1[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Matrix 2: ");
//        for (int i = 0; i <=(mat2.length)-1 ; i++) {
//            for (int j = 0; j <= (mat2[i].length)-1; j++) {
//                System.out.print(mat2[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= (sumMatrix.length)-1 ; i++) {
//            for (int j = 0; j <=(sumMatrix[i].length)-1 ; j++) {
//                sumMatrix[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//
//        System.out.println("Sum matrix: ");
//        for (int i = 0; i <=(sumMatrix.length)-1 ; i++) {
//            for (int j = 0; j <= (sumMatrix[i].length)-1; j++) {
//                System.out.print(sumMatrix[i][j]+"\t");
//            }
//            System.out.println();
//        }

        //Problem 5: WAP to reverse an array
//        System.out.println("Enter number of elements: ");
//        int elements=sc.nextInt();
//        int [] orignalArr = new int[elements];
//        int [] reversedArr = new int[elements];
//
//        for (int i = 0; i <= (orignalArr.length)-1 ; i++) {
//            System.out.println("Enter element at orignalArr["+i+"]: ");
//            orignalArr[i]= sc.nextInt();
//        }
//
//        for (int i = 0; i <= (orignalArr.length)-1 ; i++) {
//            System.out.println("Orignal order  orignalArr["+i+"]: "+orignalArr[i]);
//        }
//        for (int i = 0; i <=(reversedArr.length)-1 ; i++) {
//            reversedArr[i] = orignalArr[(orignalArr.length) - 1 - i];
//        }
//
//        for (int i = 0; i <= (reversedArr.length)-1 ; i++) {
//            System.out.println("Reversed order  reversedArr["+i+"]: "+reversedArr[i]);
//        }

        //Problem 5: reverse an array without using another array
//        int[] arr = {1,2,3,4,5,6};
//        int n =  Math.floorDiv(arr.length,2);
////        float a =  Math.floorDiv(5,2);
//        int temp;
//        for (int i = 0; i < n; i++) {
//            //swapping a[i] and a[n-i-1]<- (n-> length of array)
//            temp=arr[i];
//            arr[i]=arr[(arr.length)-i-1];
//            arr[(arr.length)-i-1]= temp;
//        }
//
//        for (int ele:arr) {
//            System.out.println(ele);
//        }

        //Problem 6: minimum element in an array
//        System.out.println("Enter number of elements: ");
//        int elements=sc.nextInt();
//        int[] mainArr= new int[elements];
//
//        //Taking input
//        for (int i = 0; i <= (mainArr.length)-1; i++) {
//            System.out.println("Enter element at mainArr["+i+"]: ");
//            mainArr[i]=sc.nextInt();
//        }
//
//        int min= mainArr[0];
//        int position=-1;
//
//        for (int i = 0; i <= (mainArr.length)-1; i++) {
//            if (mainArr[i]<min){
//                min=mainArr[i];
//                position=i;
//            }
//        }
//
//        System.out.println(min+" is the minimum element present in array at index "+position);

        //Problem 7: Hacker rank arrays
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int n = sc.nextInt();
//            //Solution
////            int sum = a;
////            for (int j=0; j < n; j++) {
////                sum += Math.pow(2, j) * b;
////                System.out.print(sum + " ");
////            }
////            System.out.println();
//            int sum=a;
//            for (int j = 0; j < n; j++) {
//                sum= (int) (sum+Math.pow(2,j)*b);
//                System.out.print(sum+ " ");
//            }
//            System.out.println();
//        }

//        System.out.println(Math.pow(x, y));//<- 2^2 (x^y)

        //Problem 8: leet code 2 sum

        /*
        class Solution {
        public int[] twoSum(int[] nums, int target) {
            int len = nums.length;
            for (int i = 0; i <=len-1 ; i++) {
                for (int j = i+1; j <=len-1; j++) {
                    if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                    }
                    }
                }
                return new int[]{};
            }
        }
        */
        //Problem 6: max integer in array(code with harry)
//        System.out.println("Enter number of elements: ");
//        int elements=sc.nextInt();
//        int[] mainArr= new int[elements];
//
//        //Taking input
//        for (int i = 0; i <= (mainArr.length)-1; i++) {
//            System.out.println("Enter element at mainArr["+i+"]: ");
//            mainArr[i]=sc.nextInt();
//        }
//
//        int max=Integer.MIN_VALUE;//This will take the minimum value possible
//        System.out.println(max);
//        for (int e:mainArr) {
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("The value of maximum element in array is: "+max);
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        //Problem 7: Is array sorted?
//        System.out.println("Enter number of elements: ");
//        int elements=sc.nextInt();
//        int[] mainArr= new int[elements];
//
//        //Taking input
//        for (int i = 0; i <= (mainArr.length)-1; i++) {
//            System.out.println("Enter element at mainArr["+i+"]: ");
//            mainArr[i]=sc.nextInt();
//        }
//
//        System.out.println("Unsorted array: ");
//        //Printing the input array
//        for(int e: mainArr){
//            System.out.println(e);
//        }
//
//        for (int i = 0; i <= (mainArr.length)-1; i++) {
//            int temp=0;
//            for (int j = i+1; j <= (mainArr.length)-1 ; j++) {
//                if(mainArr[i]>mainArr[j]){
//                temp=mainArr[j];
//                mainArr[j]=mainArr[i];
//                mainArr[i]=temp;
//                }
//            }
//        }
//
//        //Printing Sorted array
//        System.out.println("Sorted array: ");
//        for(int e: mainArr){
//            System.out.println(e);
//        }

//        //Used imported package here
//        int [] numbers={1,2,3,4,5,6,7,8,9};
//        OneDArrayUtils.printArray(numbers);

//        System.out.println("Enter no. of elements: ");
//        int elements=sc.nextInt();
//        int[] integerNums = new int[elements];
//
//        OneDArrayUtils.enterValuesToIntArray(integerNums);
//        OneDArrayUtils.printArray(integerNums);


        sc.close();
    }
}
