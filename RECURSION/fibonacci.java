package BASIC_RECURSION;
import java.util.Scanner;

public class fibonacci {

    // Recursive function to get nth Fibonacci number
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();  // number of terms in the series
        sc.close();

        System.out.println("Fibonacci series till " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
