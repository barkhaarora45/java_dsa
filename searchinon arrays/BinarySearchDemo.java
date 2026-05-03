import java.util.Scanner;
import java.util.Arrays; // Needed for sorting the array

public class BinarySearchDemo {
    public static void main(String[] args) {
        // 1. Create Scanner object
        Scanner sc = new Scanner(System.in);

        // 2. Ask user for size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // 3. Create array
        int[] arr = new int[n];

        // 4. Input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 5. SORT the array (MANDATORY for Binary Search)
        // We sort it automatically here so the algorithm works correctly.
        Arrays.sort(arr);

        // 6. Print the sorted array so the user sees the new order
        System.out.print("The sorted array is: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        // 7. Ask for the element to find
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // 8. Perform Binary Search Operation
        int low = 0;
        int high = n - 1;
        int foundIndex = -1; // Default to -1 (meaning "not found")

        while (low <= high) {
            // Calculate mid index
            // We use this formula to prevent integer overflow for large arrays
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                foundIndex = mid;
                break; // Found it, exit loop immediately
            } 
            else if (arr[mid] < target) {
                // Middle is smaller than target, so target is in the Right Half
                low = mid + 1;
            } 
            else {
                // Middle is larger than target, so target is in the Left Half
                high = mid - 1;
            }
        }

        // 9. Output result
        if (foundIndex != -1) {
            System.out.println("Success! Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }
}























