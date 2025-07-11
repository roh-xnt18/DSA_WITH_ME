package BASIC_RECURSION;
import java.util.*;

public class SubsetSumToK {

    public static void findSubsets(int[] arr, int index, List<Integer> current, int target) {
        if (index == arr.length) {
            if (target == 0) {
                System.out.println(current);
            }
            return;
        }

      
        current.add(arr[index]);
        findSubsets(arr, index + 1, current, target - arr[index]);

        current.remove(current.size() - 1);

        findSubsets(arr, index + 1, current, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        findSubsets(arr, 0, new ArrayList<>(), k);
    }
}
