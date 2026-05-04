import java.util.*;

public class findelementinthearray {
    public static void main(String[] args) {
        int n;
        int req_no;
        int flag = 0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.println("Enter the required number which you want : ");
        req_no = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == req_no) {
                flag = 1;
                index = i;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("number is founded at index" + index);
        }

    }

}
