package algorithmanalysis;

import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class findduplicates {
    public static void findDuplicates(int id[]) {
        System.out.println("duplicate student id : ");
        for (int i = 0; i < id.length; i++) {
            for (int j = i + 1; j < id.length; j++) {
                if (id[i] == id[j]) {
                    System.out.print(id[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of student ids in the given database");
        int n = sc.nextInt();
        int id[] = getInput(n);
        printId(id);
        findDuplicates(id);
    }

    public static int[] getInput(int n) {
        int input[] = new int[n];
        Random randomnumber = new Random();
        for (int i = 0; i < n; i++) {
            input[i] = randomnumber.nextInt(1, 2 * n);
        }
        return input;
    }

    public static void printId(int[] id) {
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i] + " ");
        }
        System.out.println();
    }

}
