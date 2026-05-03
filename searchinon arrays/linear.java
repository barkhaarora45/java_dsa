import java.util.*;
public class linear{
    static int linear(int[] arr, int target){
        if(arr==null ||arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

    }
}