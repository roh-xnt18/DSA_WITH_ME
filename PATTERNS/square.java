package PATTERNS;

import java.util.Scanner;

public class square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}