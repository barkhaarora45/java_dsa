import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        // 1. Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // 2. Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // 3. Create the array of the specified size
        int[] arr = new int[n];

        // 4. Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 5. Print the array (as requested)
        System.out.print("The array you entered is: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        // 6. Ask for the element to find
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // 7. Perform Linear Search Operation
        int foundIndex = -1; // Default value assuming not found

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                foundIndex = i; // Store the index where it was found
                break;          // Stop searching once found
            }
        }

        // 8. Output the result
        if (foundIndex != -1) {
            System.out.println("Success! Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Close the scanner
        sc.close();
    }
}