import java.util.HashMap;

public class count_frequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3, 4, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element : Frequency");
        for (int key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
