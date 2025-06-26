package BASIC_RECURSION;
import java.util.Scanner;

public class Print_from_n {

    public static void print(int n1, int n2) {
        if(n1>1){
            return;
        }
        System.out.println(n1);
        print(n1-1, n2);
        
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close();
       print(n, n); 
    }
    
}
