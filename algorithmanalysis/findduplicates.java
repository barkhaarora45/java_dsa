package algorithmanalysis;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

/**
 * Algorithm Analysis: Finding Duplicates in an Array.
 * This class demonstrates the Brute Force approach to finding duplicate elements.
 */
public class findduplicates {

    /**
     * Finds and prints duplicate elements in the array using a Brute Force approach.
     * 
     * Algorithm Steps:
     * 1. Pick an element from the array (outer loop).
     * 2. Compare it with every subsequent element (inner loop).
     * 3. If a match is found, it's a duplicate.
     * 
     * Time Complexity: O(n^2) - because of nested loops.
     * Space Complexity: O(1) - no extra space used.
     * 
     * @param id Array of student IDs
     */
    public static void findDuplicates(int id[]) {
        System.out.println("Duplicate student IDs found: ");
        
        // Outer loop picks each element one by one
        for (int i = 0; i < id.length; i++) {
            // Inner loop compares the picked element with the rest of the array
            for (int j = i + 1; j < id.length; j++) {
                // If elements at i and j are same, we found a duplicate
                if (id[i] == id[j]) {
                    System.out.print(id[i] + " ");
                    // Break the inner loop once a duplicate is found for id[i]
                    // to avoid printing the same duplicate multiple times for the same 'i'
                    break;
                }
            }
        }
        System.out.println();
    }

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Get the size of the database from user
        System.out.println("Enter the number of student IDs in the database:");
        int n = sc.nextInt();
        
        // Step 2: Generate random data
        int id[] = getInput(n);
        
        // Step 3: Print the generated database
        System.out.println("Generated Database IDs:");
        printId(id);
        
        // Step 4: Run the duplicate detection algorithm
        findDuplicates(id);
    }

    /**
     * Generates an array of random student IDs.
     * 
     * @param n The number of IDs to generate
     * @return An array populated with random integers
     */
    public static int[] getInput(int n) {
        int input[] = new int[n];
        Random randomnumber = new Random();
        
        for (int i = 0; i < n; i++) {
            // Generates a random number between 1 and 2*n
            input[i] = randomnumber.nextInt(1, 2 * n);
        }
        return input;
    }

    /**
     * Utility method to print all elements of the ID array.
     * 
     * @param id The array to be printed
     */
    public static void printId(int[] id) {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println(); // New line after printing the list
    }
}
