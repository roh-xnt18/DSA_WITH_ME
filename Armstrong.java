package BASIC_MATHS;
import java.util.Scanner;

public class Armstrong {
    public static int armstrong(int n) {
        int dup = n;
        int sum = 0;
       
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
           
            sum = sum+(lastdigit*lastdigit*lastdigit);
            n = n/10;
            rev = rev*10+lastdigit;
        }
        if(dup == sum){
            return 1;

        }
        else{
            return 0;
        }
    } 

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = read.nextInt();
        read.close();
        int result = armstrong(n);
        if(result == 1){
            System.out.println("Armstrong Number");     }
     
   else{
        System.out.println("Not a Armstrong Number");
     }
}
}
