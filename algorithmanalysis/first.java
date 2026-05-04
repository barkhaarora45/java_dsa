//my first comment 
//threadlocalrandom function-->>using for the multiple random numbers generate 
//in the multithread environment generate different random number for the each thread

package algorithmanalysis;

import java.util.concurrent.ThreadLocalRandom;
/*
  **why we use 
  threadlocalrandom ** 
  1. used in the multithreading 
  2.faster than random in concurrent programs
  3.no need to create object()current()
 method)
 thread safe by design 

 ***==>>>it can be used in the shortest path algorithm for the random number generation in the graph algorithm **

 */

public class first {
    public static void main(String[] args) {
        // generate random number between 1 to 100

        int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println("Randomnumber generated: " + randomNum);

    }
}
