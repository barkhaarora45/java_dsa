/* import java.uti.Scanner
public class practice{
    public static void main(String[] args){
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle");
        float p = nextFloat();

        System.out.println("enter rate of interest");
        float r = sc.nextFloat()

        System.out.println("enter time");
        float t = nextFloat();
    }
} */





//             ******************tofind character at particular position

/* import java.util.Scanner;
public class practice{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a character");
    char ch = sc.next().charAt(0);
    System.out.println("character is : "+ch);
    }
} */



//       **************unary operator -> only applied on one operand like -> +10,-10,++10,10++,!10 
//        *****************bitwise operator-> it is only apply on bits like 0 and 1*******
/* public class practice{
    public static void main(String[] args){
        int p =9,q = 10;

        System.out.println(p|q);   //bitwise or  11
        System.out.println(p&q);   //bitwise and 8
        System.out.println(p^q);    //bitwise xor 3->  if bits are same than false or different means true

        System.out.println(p<<1);    //bitwise left ->it shifts bits to the left by 1 and number = p*2^1
        System.out.println(p>>2);   //bitwise right ->it shifts bits to the right by 2 and number = p/2^2
        }
    }  */





/* 
import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();


        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thurday");
                break;
            default:
            System.out.println("nothing");

        }
    }
} */




//     ********************loops questions*************
/* import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i = 1;i<=n;i++){
            if(i%2==0){
                sum = sum-i;
            }
            else{
                sum = sum+i;
            }
        }
        System.out.println(sum);

    }
} */



/* import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        for(int i =0;i<3;i++){
            for(int j =0;j<6;j++){
                System.out.print("*");
            }
            System.out.prinllt("\n");
        }

    }
}  */


/* import java .util.scanner;
public class practice{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int rollnum = nextInt();
        rollnum = rollnum % 10;

    }
} */



/* import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int rev = 0;
        int rem;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        if(rev == number){
            System.out.println("it's palindrome number");
        }
        else{
            System.out.println("it's not a palindrome number");
        }
    }
} */





// *********************remove the duplicant******************
import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int rev = 0;
        int rem;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        if(rev == number){
            System.out.println("it's palindrome number");
        }
        else{
            System.out.println("it's not a palindrome number");
        }
    }
} 

