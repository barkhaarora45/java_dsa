/* import java.util.*;  // binary number to decimal number************
public class number_conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;  //conversion to decimal number
        int pw = 1;  

        while(n>0){
            int unit_digit = n%10;
            ans+=(unit_digit * pw);
            n /= 10;
            pw*=2;
        }
        System.out.println(ans);
        
    }
}
 */


import java.util.*;  // binary number to decimal number************
public class number_conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int pw = 1;

        while(n > 0){
            int parity = n % 2;
            ans += (parity * pw);
            pw*=10;
            n /= 2; 
        }
        System.out.println(ans);
        
    }
}