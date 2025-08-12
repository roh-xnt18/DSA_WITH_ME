import java.util.HashMap;

public class unordered_map{
    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();

        // Insert key-value pairs
        hashTable.put("apple", 10);
        hashTable.put("banana", 20);
        hashTable.put("orange", 30);

        // Access values
        System.out.println("apple: " + hashTable.get("apple"));
        System.out.println("banana: " + hashTable.get("banana"));

        // Search for a key
        String key = "orange";
        if (hashTable.containsKey(key)) {
            System.out.println(key + " found with value: " + hashTable.get(key));
        } else {
            System.out.println(key + " not found!");
        }
    }
}
