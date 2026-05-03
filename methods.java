/* public class methods { 
    static int plusMethodInt ( int x, int y){
        return x + y ;

    }
    static double plusMethodInt(double x , double y){
        return x+y ;
    }
    public static void main(String[] args){
        int mynub1 = plusMethodInt(8,2);
        double mynum2 = plusMethodInt(4.3 , 6.26);
        System.out.println(mynub1);
        System.out.println(mynum2);

    }
    
}
 */




//     **************************adding two numbers****************
import java.util.*;
class Algebra{
        int add(int a,int b){
            return a+b;
    }
}

public class methods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Algebra obj = new Algebra();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.add(a, b));
    }
}