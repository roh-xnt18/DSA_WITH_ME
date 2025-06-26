package BASIC_MATHS;
import java.util.Scanner;


public class Palindrome {
    public static int palindrome (int n) {
        int rev = 0;
        int dupl = n;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10+lastdigit;
            n = n/10;
        }
        if(dupl == rev){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = palindrome(n);
        if(result == 1){
            System.out.println("palindrome");

        }
        else{
            System.out.println("Not a palindrome");
        }
            
        
    }
}
