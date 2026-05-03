import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Algorithm Analysis: Finding Duplicates in an Array.
 * This class demonstrates an Optimized approach using a Frequency Array (Counting).
 */
public class findduplicates2 {

    /**
     * Finds and prints duplicate elements using a frequency array.
     * 
     * Algorithm Steps:
     * 1. Create a 'count' array to store the frequency of each number.
     * 2. Iterate through the input array once.
     * 3. For each number, increment its value in the 'count' array.
     * 4. If the count reaches 2, it means we've found the first duplicate occurrence.
     * 
     * Time Complexity: O(n) - we only loop through the array once.
     * Space Complexity: O(k) - where k is the maximum possible value in the array.
     * 
     * @param id Array of student IDs
     */
    public static void duplicates(int[] id) {
        // Frequency array to keep track of occurrences
        // Note: Size 1000 assumes IDs are between 0 and 999
        int count[] = new int[1000]; 
        
        System.out.println("Duplicate student IDs found:");
        boolean found = false;

        for (int i = 0; i < id.length; i++) {
            // Increment the frequency of the current ID
            count[id[i]]++;
            
            // If it's exactly 2, it's a duplicate (we only print it once)
            if (count[id[i]] == 2) {
                System.out.print(id[i] + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.print("None");
        }
        System.out.println(); // Final newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of student IDs (max 500 to stay within ID range):");
        int n = sc.nextInt();
        
        // Step 1: Generate random data
        int id[] = getInput(n);
        
        // Step 2: Print generated data
        System.out.println("Generated Database IDs:");
        printId(id);
        
        // Step 3: Run the optimized duplicate detection
        duplicates(id);
    }

    /**
     * Generates random IDs between 1 and 2*n.
     */
    public static int[] getInput(int n) {
        int id[] = new int[n];
        Random randomnum = new Random();
        for (int i = 0; i < n; i++) {
            // Ensures IDs stay within the 0-999 range for our count array
            id[i] = randomnum.nextInt(1, Math.min(2 * n, 1000));
        }
        return id;
    }

    /**
     * Utility method to print IDs.
     */
    public static void printId(int[] id) {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println("\n");
    }
}
