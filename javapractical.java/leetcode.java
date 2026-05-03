/* public class leetcode {
    public int[] twoSum(int[] nums,int target){
        int sum =0;
        for(int i=0;i<=nums.length;i++){
            for(int j=i+1;j<=nums.length;j++){
                if(nums[i]+nums[j]==target){
                   int[] num = {i,j};
                   return num;
                }
            }
        }
    }

   
 */



/* import java.util.Stack;
public class leetcode{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();

        //push elements into the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
    }
}

 */


/* 
 import java.util.Stack;
 public class leetcode{

    static void stack_push(Stack<Integer> st){//add elements in stack
        for(int i =1;i<=4;i++){
            st.push(i);
        }
    }

    static int stack_peek(Stack<Integer> st){
        int top_value = st.peek();
        return top_value;
    }


    static void stack_pop(Stack<Integer> st){
        for(int i = 1;i<=4;i++){
            int y = st.pop();
            System.out.println(y);
        }
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        stack_push(s);
        System.out.println(s);
        System.out.println(stack_peek(s));
        stack_pop(s);
        System.out.println(s);
    }
 }
 */



import myproject.*;
import java .util.Stack; 
import java.util.*;
public class leetcode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int rev = 0;
        int rem;
        Stack<Integer> s = new Stack<>();
        while(n>0){
            rem = n%10;
            s.push(rem);
            n=n/10;
        }
        
        System.out.println(s);
    }
} 


