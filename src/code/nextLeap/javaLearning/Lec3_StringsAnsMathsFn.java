package code.nextLeap.javaLearning;

import java.util.*;

public class Lec3_StringsAnsMathsFn {
    public static void main(String[] args) {
        /*
updta        10th July, 2023




         */
//        trianglePattern(7);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter value of N:");
//
//        // n is always odd
//        int n = in.nextInt();
//
//        int stars = 1;
//        int spaces = n-1;
//
//        // UPPER PART OF THE DIAMOND
//        for(int i=1; i<=(n/2 + 1); i++)
//        {
//            for(int j=1; j<=spaces; j++)
//            {
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=stars; j++)
//            {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//            spaces = spaces - 2;
//            stars = stars + 2;
//        }
//
//        spaces = 2;
//        stars = n-2;
//        // LOWER PART OF DIAMOND
//        for(int i=1; i<=(n/2); i++)
//        {
//            for(int j=1; j<=spaces; j++)
//            {
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=stars; j++)
//            {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//            spaces = spaces + 2;
//            stars = stars - 2;
//        }

        //Star pattern end
//
//        System.out.println(7/2);
//        LinkedList<Integer> list = new LinkedList<>();
//        int i=1;
//        while(i<=5){
//            list.add(i);
//            i++;
//        }
//        for (int ele:list) {
//            System.out.println(ele);
//        }
//        System.out.println(list.getFirst());
//        Solution obj = new Solution();

//        obj.pattern(3);
//        obj.rectangleDraw(3,3);

    }
//    public static void trianglePattern(int n) {
//        int space=n-1;
//        int star = 1;
//        for (int i = 1; i <= n ; i++) {
//            for (int j=1; j<= space ; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= star ; k++) {
//                System.out.print("*");
//            }
//            space-=1;
//            star++;
//            System.out.println();
//        }
//    }

}
/*
class Solution {
    public int maximumOnesRow(int[][] arr, int r, int c) {
        int maximumOnesRow = -1, currentRowWithMaxOnes = -1, currentCountOfOnes = 0, maxCountOfOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    currentCountOfOnes++;
                    if (currentCountOfOnes > maxCountOfOnes) {
                        maxCountOfOnes = currentCountOfOnes;
                        currentRowWithMaxOnes = i;
                    }
                }
            }
            currentCountOfOnes = 0; // Reset currentCountOfOnes for the next row
        }
        maximumOnesRow = currentRowWithMaxOnes;
        return maximumOnesRow;
    }
}*/
//class Solution {
//    public int[] findPairWithGivenSum(int[] arr, int targetSum) {
//        int[] result = new int[2];
//        for (int i = 0; i < (arr.length)/2; i++) {
//            for (int j = (arr.length)-1; j > i; j--) {
//                if(arr[i]+arr[j]==targetSum){
//                    result[0]=arr[i];
//                    result[1]=arr[j];
//                }
//            }
//        }
//        return result;
//    }
//}

//class Solution {
//    public int[] findRowMaxima(int[][] arr) {
//        int[] result = new int[arr.length];
//        int max=arr[0][0];
//        for (int i = 0; i <= (arr.length)-1; i++) {
//            for (int j = 0; j <= (arr[i].length)-1; j++) {
//                if (arr[i][j]>max){
//                    for(int k = 0; k <= (arr[i].length)-1; k++){
//                        result[k]=arr[i][k];
//                    }
//                }
//            }
//        }
//        return result;
//    }
//}
//class Solution {
//    public int countVowels(String s) {
//        int count=0;
//        int len=s.length();
//        int i=0;
//        while(i<=(len-1)){
//            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
//                s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
//                count++;
//                i++;
//            }
//            else
//                i++;
//        }
//        return count;
//    }
//}
//class Solution {
//    public int findMax(int[] arr) {
//        int max=arr[0];
//        int i=0;
//        while(i<=(arr.length)-1){
//            if(arr[i]>max){
//                max=arr[i];
//                i++;
//            }
//            else
//                i++;
//        }
//        return max;
//    }
//}
//class Solution {
//    public void LinkedList() {
//        LinkedList<Integer> list = new LinkedList<>();
//        int i=1;
//        while(i<=5){
//            list.add(i);
//            i++;
//        }
//        System.out.println(list.get(0));
//    }
//}
//class Solution {
//    public void pattern(int N) {
//        for (int i = 1; i <= N*N; i++) {
//            for (int j = 0; j <= N; j++) {
//
//            }
//            System.out.println();
//        }
//    }
//}

//class Solution {
//    public int numberOfOperations(int[] arr) {
//        int operations=0;
//
//
//
//
//
//        return operations;
//    }
//}

//class Solution {
//    public int[] recoverArray(int[] arr) {
//        int left=0, right=arr.length;
//        while (left<right&&right>left){
//            if((arr[left]%2!=0)&&(arr[right]%2==0)){
//                int temp=arr[left];
//                arr[left]=arr[right];
//                arr[right]=temp;
//                left++;right--;
//            }
//            else {
//                left++;right--;
//            }
//        }
//        return arr;
//    }
//}
//class Solution {
//    public void rectangleDraw(int M, int N) {
//        for (int i = 0; i < M; i++) {
//            for (int j = 1; j < N; j++) {
//
//            }
//            System.out.println();
//        }
//    }
//}
//class Solution {
//    public int findMinGroups(int[] nums, int x) {
//        int left = 0;
//        int right = nums.length - 1;
//        int groupCount = 0;
//
//        while (left <= right) {
//            if (nums[left] <= x) {
//                if (left == right || nums[left] + nums[right] <= x) {
//                    groupCount++;
//                    left++;
//                    right--;
//                } else {
//                    groupCount++;
//                    left++;
//                }
//            } else {
//                return -1; // If any number is greater than x, it cannot be included in any group
//            }
//        }
//        return groupCount;
//    }
//}

//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] ans=new int[nums.length];
//        int k=0, j=n;
//        int i=0;
//        while(i<n&&j<nums.length){
//            ans[k]=nums[i];
//            i++;k++;
//            ans[k]=nums[j];
//            j++;k++;
//        }
//        return ans;
//    }
//}
//class Solution {
//    public int secondLargest(int[] nums) {
//        int largest = nums[0];
//        int secondLargest = Integer.MIN_VALUE; // Initialize to the smallest possible value
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > largest) {
//                secondLargest = largest;
//                largest = nums[i];
//            } else if (nums[i] > secondLargest && nums[i] < largest) {
//                secondLargest = nums[i];
//            }
//        }
//
//        return secondLargest;
//    }
//}

//class Solution {
//    public int secondSmallest(int[] nums) {
//        int smallest = nums[0];
//        int secondSmallest = Integer.MAX_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < smallest) {
//                secondSmallest = smallest;
//                smallest = nums[i];
//            } else if (nums[i] < secondSmallest && nums[i] > smallest) {
//                secondSmallest = nums[i];
//            }
//        }
//
//        return secondSmallest;
//    }
//}

//class Solution {
//    public boolean isThree(int n) {
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        return count == 3;
//    }
//}

//class Solution {
//    public int countDigits(int num) {
//        String numStr = Integer.toString(num);
//        int count = 0;
//        for (char digitChar : numStr.toCharArray()) {
//            int digit = Character.getNumericValue(digitChar);
//            if (digit != 0 && num % digit == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//}


//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        int noOfPairs=0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(j==i) continue;
//                else if ((nums[i]==nums[j])&&i<j) {
//                    noOfPairs++;
//                }
//
//            }
//        }
//        return noOfPairs;
//    }
//}

//class Solution {
//    public int missingNumber(int[] nums) {
//        int maxNum=Integer.MIN_VALUE;
//        for (int i = 0; i < (nums.length); i++) {
//            if(nums[i]>maxNum)
//                maxNum=nums[i];
//        }
//
//        int i=1, totalSum=0;
//        while(i<=maxNum){
//            totalSum+=i;
//        }
//
//        for (int e:nums) {
//            totalSum-=e;
//        }
//
//        return totalSum;
//
//    }
//}

//class Solution {
//    public int findLargestElement(int []nums) {
//        long largestElement=Integer.MIN_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>largestElement){
//                largestElement=nums[i];
//            }
//        }
//
//        return ((int) largestElement);
//    }
//}

//class Solution {
//    public int findSmallest(int[] nums) {
//        int smallest=nums[0];
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]<smallest)
//                smallest=nums[i];
//        }
//        return smallest;
//    }
//}

//class Solution {
//    public int[] revArr(int[] arr, int i, int j){
//        if(i>=j)
//            return arr;
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        return revArr(arr,i+1,j-1);
//    }
//    public int[] reverseArray(int[] nums) {
//        int i=0,j= (nums.length)-1;
//        return revArr(nums,i,j);
//    }
//}


//class Solution {
//    public int maxProfit(int[] prices) {
//        int minPrice=Integer.MAX_VALUE, minPricePosition=-1, maxPrice=Integer.MIN_VALUE, maxPricePosition=-1;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i]<minPrice){
//                minPricePosition=i;
//                minPrice=prices[i];
//            }
//            if (prices[i]>maxPrice){
//                maxPricePosition=i;
//                maxPrice=prices[i];
//            }
//        }
//
//        if((minPricePosition>maxPricePosition)||(minPricePosition==prices[(prices.length)-1])){
//            return 0;
//        }
//        else {
//            return (maxPrice-minPrice);
//        }
//    }
//}


