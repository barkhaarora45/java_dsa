/* public class Basics{
    public static void main(String[] args){
        System.out.println("8");
        System.out.println(9);
        System.out.println("8+9");
        System.out.println(8+9);

    }
}
 */


/* // variable in java **************************
import java.util.*;
public class Basics{
    public static void main(String[]args){
        int x;
        String name;
        name = "barkha";
        System.out.println(name); 
        x = 9;
        System.out.println(x);
        x = 700;
        System.out.println(x);
    }
} */


//take input by scanner class***********************
/* import java.util.*;//it used as package which have scanner class code for input
public class Basics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();// next only takes one word  ****nextline() function take more than one word as input
        System.out.println(name);
        // nextInt = take input for intrger value
    }
} 
 */




//       *******************add two numbers*************
/* import java.util.*;
public class Basics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.print("the sum is ");
        System.out.println(a+b);
    }
} */


//       ***************if else*******************
/* import java.util.*;
public class Basics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}
 */





 //        ***************switch case******************
/*  import java.util.*;
public class Basics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
             System.out.println("barkha");
             break;
            case 2:
            case 3:
            case 4:
            System.out.println("arora");
            break;
            default:
            System.out.println("anjali");
        }
    }
}  */






//              **************loops*************************
/* public class Basics{
    public static void main(String[] args){
        int n = 1;
       for(int i=1;i<=5;i++){
        for(int j =1;j<=i;j++){
           if((i+j)%2==0){
            System.out.print("1" + " ");
           }
           else{
            System.out.print("0" + " ");
           }
        }
        System.out.println();
        
       }
    }
}
 */




 //                 *******************for printing a pattern*******************
/*  public class Basics{
    public static void main(String[] args){
        int n = 8;
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=n-(2*i);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }//upeer half*********
        for(int i = 4;i>=1;i--){second half***************
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=n-(2*i);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
 } */





 //                          ********************another loop ******************
/* public class Basics{
    public static void main(String[] args){
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(" ");
        for(int i =4;i>=1;i--){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */





//      **************************another pattern***********
/* public class Basics{
    public static void main(String[] args){
        int n =5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(i-(j-1) + );
            }
            for(int j =1;j<i;j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
 */





/* import java.util.*;
public class Basics {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // new keyword in java is used to allocate memory to objects and reference is stored in variable sc
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans =1;
        for(int i =1;i<=b;i++){
            ans = ans*a;
        }
        System.out.println(ans);
    }
}
 */


 /* import java.util.*;
public class Basics {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // new keyword in java is used to allocate memory to objects and reference is stored in variable sc
       int raw = sc.nextInt();
       int column = sc.nextInt();
        for(int i=1;i<=raw;i++){
            for(int j=1;j<raw-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=raw-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
 */
