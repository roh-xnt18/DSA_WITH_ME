package HASHING;
import java.util.HashMap;

public class simplehashing {
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Insert elements into the hash map
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        // Accessing an element
        System.out.println("Value for key 'banana': " + map.get("banana"));

        // Check if a key exists
        if (map.containsKey("apple")) {
            System.out.println("Key 'apple' found with value: " + map.get("apple"));
        }

        // Remove a key
        map.remove("orange");

        // Display all elements in the hash map
        System.out.println("Current HashMap contents:");
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}
