package BASIC_RECURSION;

public class Swap_array {

    public static void swapper(int[] a, int l, int r) {
        if (l >= r)
            return;
        
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;

        swapper(a, l + 1, r - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
        
        swapper(a, 0, n - 1); 
        
        
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
