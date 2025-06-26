package BASIC_RECURSION;
import java.util.Scanner;

public class Five_Times_Name {
    public static void printname(int n1, int n2) {
        if(n1>n2)
        return;
        System.out.println("Rohan kumar");
        printname(n1-1, n2);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number which you want print till :");
       int n = sc.nextInt();
       sc.close();
       printname(1, n);

    }
}
