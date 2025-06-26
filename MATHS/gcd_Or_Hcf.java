package BASIC_MATHS;
import java.util.Scanner;
public class gcd_Or_Hcf {

    public static int gcd(int n1, int n2) {
        int gcd=1;
        for(int i=1; i<=Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two Numbers to find GCD or HCF :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        int gcd = gcd(n1, n2);
        System.out.println("GCD or HCF of " +n1+ " and " +n2+ " is = " +gcd);
    }
    
}
