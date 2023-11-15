package code.codeWithHarry.practiceSet.Ch6_Arrays;
import java.util.Scanner;

//import static code.codeWithHarry.practiceSet.Ch6_Arrays.ArrayUtils.OneDArrays.OneDArrayUtils.enterValuesToIntArray;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int elements=sc.nextInt();
        int[] arr=new int[elements];

        //enterValuesToIntArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at "+i+": ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to find: ");
        int x = sc.nextInt();

        int right = arr.length - 1;  // Adjusted the right boundary
        int left = 0;
        int elementAt = -1;  // Initialize with a value that indicates not found

        while (left <= right) {  // Changed loop condition
            int mid = (left + right) / 2;  // Calculate the new mid

            if (arr[mid] == x) {
                elementAt = mid;
                break;  // Found the element, no need to continue
            }

            if (arr[mid] > x) {
                right = mid - 1;  // Update the right boundary
            } else {
                left = mid + 1;  // Update the left boundary
            }
        }

        if (elementAt != -1) {
            System.out.println("Element found at: " + elementAt);
        } else {
            System.out.println("Element not found.");
        }
    }
}
