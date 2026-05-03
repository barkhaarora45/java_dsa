/* import java.util.*;
public class hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("china",150);
        map.put("India",120);
        map.put("US",100);

        System.out.println(map);

        if(map.containsKey("china")){
            System.out.println("it has china");
        }
        else{
            System.out.println("it has not china");
        }

        System.out.println(map.get("china"));
    } 

    //iteration using iteration class of util package 
    for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }

    //set for only keys 

    Set<String> keys = map.keySet();
    for(String key:keys){
        System.out.println(key + " " + map.get(key));
    }
 }
} */



//              *****************implementation of hashmaps in java**************

import java.util.*;
public class hashmap{
     static class HashMap<K,V>{//generics
        public class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N = 4;
            this.buckets[] = new LinkedList[4];
            for(int i =0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

     }

}