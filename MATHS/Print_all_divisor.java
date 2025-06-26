package BASIC_MATHS;
import java.util.Scanner;

public class Print_all_divisor {
    public static int all_divisor(int n) {
        System.out.println("The divisor of " +n + " are :");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
       System.out.println("Enter a number which you want all divisor :");
       
       int n = read.nextInt();
       read.close();
       
       System.out.println("All divisors are : " ); 
       all_divisor(n);
    }
}
