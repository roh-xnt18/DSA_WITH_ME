package BASIC_RECURSION;

public class subsequences {
     public static void printSubsequences(int[] arr, int index, String output) {
       
        if (index == arr.length) {
            System.out.println(output.trim());
            return;
        }

      
        printSubsequences(arr, index + 1, output);

      
        printSubsequences(arr, index + 1, output + arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("All subsequences of the array:");
        printSubsequences(arr, 0, "");
    }
}
