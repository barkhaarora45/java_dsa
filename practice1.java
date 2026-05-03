import java.util.HashMap;
import java.util.Map;

public class practice1 {
    public static void main(String[] args) {

        // 1. Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Add/put elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Dates");

        // 3. Print full HashMap
        System.out.println("Initial HashMap: " + map);

        // 4. Access value using key
        System.out.println("Value at key 2: " + map.get(2));

        // 5. Update element (replace)
        map.put(3, "Coconut");
        System.out.println("After updating key 3: " + map);

        // 6. Check if key exists
        System.out.println("Contains key 4? " + map.containsKey(4));

        // 7. Check if value exists
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // 8. Remove element
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // 9. Size of HashMap
        System.out.println("Current size: " + map.size());

        // 10. Iterating over keys
        System.out.println("\nIterating Keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 11. Iterating over values
        System.out.println("\nIterating Values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 12. Iterating over key-value pairs (entries)
        System.out.println("\nIterating Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " → Value: " + entry.getValue());
        }

        // 13. Clear all elements
        map.clear();
        System.out.println("\nHashMap after clear(): " + map);
    }
}
