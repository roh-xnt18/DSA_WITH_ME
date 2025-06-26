package BASIC_MATHS;
import java.util.Scanner;

public class Check_Prime {
    public static int Checkprime(int n) {
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }  
        }
        if(count == 2){
                return 1;
            }
            else{
                return 0;
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number is prime or Not : ");
        int n = sc.nextInt();
        sc.close();
        int result = Checkprime(n);
        
        if(result == 1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
}
