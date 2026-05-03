
/* import java.util.ArrayList;

public class Barkha {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Fruits list after adding elements: " + fruits);

        // Accessing an element
        System.out.println("Element at index 2: " + fruits.get(2)); // Mango

        // Updating an element
        fruits.set(1, "Grapes");  // Replace Banana with Grapes
        System.out.println("After set() method: " + fruits);

        // Removing an element
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // Clearing the list
        fruits.clear();
        System.out.println("After clear(), the list is: " + fruits);
    }
}
 */


 /* import java.util.ArrayList;

 public class Barkha{
    public static void main(String[] args){
        ArrayList<String> girls = new ArrayList<>();

        //adding elements
        girls.add("sheela");
        girls.add("palak");
        girls.add("barkha");
        System.out.println(girls);

        //accessing any element
        System.out.println(girls.get(0));

        //updating an element
        girls.set(1,"sanjavi");
        System.out.println(girls);

        girls.remove("");



    }
 } */

package myproject;
import java.util.ArrayList;
public class Barkha {
 
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        int sum =0;

        for(int i=0;i<a.size();i++){
            sum = sum+a.get(i);
        }
        System.out.println(sum);
    }
 } 


