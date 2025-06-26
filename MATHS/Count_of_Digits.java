package BASIC_MATHS;
import java.util.Scanner;

public class Count_of_Digits {
    public static int count(int n) {
        int cnt = (int)(Math.log10(n)+1);
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = count(n);
        System.out.println("Count of digits in " +n + "is : " + result);
    }
}
