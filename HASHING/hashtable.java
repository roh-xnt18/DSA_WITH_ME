package HASHING;
import java.util.*;

class HashTable {
    private int BUCKET;
    private LinkedList<Integer>[] table;

    // Constructor
    @SuppressWarnings("unchecked")
public HashTable(int size) {
    BUCKET = size;
    table = new LinkedList[BUCKET];
    for (int i = 0; i < BUCKET; i++) {
        table[i] = new LinkedList<>();
    }
}

    // Hash function
    private int hashFunction(int key) {
        return key % BUCKET;
    }

    // Insert key into hash table
    public void insert(int key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

    // Remove key from hash table
    public void remove(int key) {
        int index = hashFunction(key);
        table[index].remove((Integer) key);  // Cast to Integer to remove by value
    }

    // Display the hash table
    public void display() {
        for (int i = 0; i < BUCKET; i++) {
            System.out.print("Bucket " + i + ": ");
            for (int key : table[i]) {
                System.out.print(key + " -> ");
            }
            System.out.println("NULL");
        }
    }
}

public class hashtable {
    public static void main(String[] args) {
        HashTable h = new HashTable(7);  // 7 buckets

        h.insert(10);
        h.insert(20);
        h.insert(15);
        h.insert(7);
        h.insert(22);

        System.out.println("Initial hash table:");
        h.display();

        h.remove(15);
        System.out.println("\nAfter deleting 15:");
        h.display();
    }
}
