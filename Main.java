/* import java.util.*;
public class methods{
    public static int printsum(int a,int b){
       if(a>b){
        return a;
       }
       else{
        return b;
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = printsum(a,b);
        System.out.println(sum);
    }
} */


/* import java.util.*;
public class methods {

    public static void main(String[] args) {
        int pocount = 0;
        int negcount = 0;
        int zerocount = 0;
        Scanner sc = new Scanner(System.in); // Declare outside the loop
        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            if (a > 0) {
                pocount++;
            } else if (a < 0) {
                negcount++;
            } else {
                zerocount++;
            }
        }
        sc.close(); // Close the scanner
        System.out.println(pocount);
        System.out.println(negcount);
        System.out.println(zerocount);
    }
}

 */




 
//               ********1->  rite a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.   
/* 
 import java.util.*;
public class methods {

    public static void main(String[] args) {
        int pocount = 0;  // Initialize counter for positive numbers
        int negcount = 0; // Initialize counter for negative numbers
        int zerocount = 0; // Initialize counter for zeros
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        for (int i = 1; i <= 10; i++) { // Loop 10 times
            String input = sc.next(); // Read input as a string
            if (input.equals("*")) { // Check if the input is an asterisk
                break; // If it is, break out of the loop
            }
            int a = Integer.parseInt(input); // Convert the input string to an integer
            if (a > 0) { // Check if the integer is positive
                pocount++; // Increment positive counter if true
            } else if (a < 0) { // Check if the integer is negative
                negcount++; // Increment negative counter if true
            } else { // Otherwise, it must be zero
                zerocount++; // Increment zero counter
            }
        }
        sc.close(); // Close the Scanner object
        System.out.println(pocount); // Print the count of positive numbers
        System.out.println(negcount); // Print the count of negative numbers
        System.out.println(zerocount); // Print the count of zeros
    }
} */








//           ques.2. **************Write a function that calculates the Greatest Common Divisor of 2 numbers
/* public class methods {

    // Function to calculate the GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}
 */









 //          *******************print fibonacci series****************

/*  public class methods{
    public static void main(String[] args){
        int n = 8;
        int first = 0;
        int second = 1;
        int next;
        System.out.println(first);
        System.out.println(second);
        for(int i =3;i<=8;i++){
            next = first+second;
            first = second;
            second = next;
            System.out.println(next);
        }
    }
 } */



public class Main{
    static int mymethod(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args){
        int z = mymethod(5,3,8);
        int x = mymethod(3,6,7);
        System.out.println(x);
        System.out.println(z);
        int y = mymethod(z,x,6);
        System.out.println(y);
    }
}