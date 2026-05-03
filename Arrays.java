   
import java.util.Scanner;
class Source {
    public static void main(String[] args) {


    //Create new scanner
    Scanner input = new Scanner(System.in);

    //Values of each digit
    int tenThousands, thousands, hundreds, tens, ones;

    //Prompt user to input 5 digit number
       
    int number = input.nextInt();
    if (number > 99999) {
        System.out.println("\nError! Number more than 5 digits.");
        }
    else if (number < 10000) {
        System.out.println("Error! Number less than 5 digits.");
        }
    else if (10000<=number&&number<=99999){
        //WRITE YOUR CODE HERE
         tenThousands = number / 10000;
         thousands = (number / 1000) % 10;
         hundreds = (number / 100) % 10;
         tens = (number / 10) % 10;
         ones = number % 10;
        
        // Displaying the results
        System.out.println("Ten Thousands place: " + tenThousands);
        System.out.println("Thousands place: " + thousands);
        System.out.println("Hundreds place: " + hundreds);
        System.out.println("Tens place: " + tens);
        System.out.println("Ones place: " + ones);
        
        input.close();
        }
     }
}
