import java.util.HashMap;

public class count_the_no_of_subarrays{
    
    public static int countSubarraysEqual01(int[] arr) {
        HashMap<Integer, Integer> prefixFreq = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        prefixFreq.put(0, 1); 

        for (int num : arr) {
            if (num == 0) num = -1;

            if (prefixFreq.containsKey(prefixSum)) {
                count += prefixFreq.get(prefixSum);
            }

            prefixFreq.put(prefixSum, prefixFreq.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 1, 1, 0};
        System.out.println("Number of subarrays with equal 0s and 1s: " 
                           + countSubarraysEqual01(arr));
    }
}
