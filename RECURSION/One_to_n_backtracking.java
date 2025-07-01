package BASIC_RECURSION;
import java.util.Scanner;
public class One_to_n_backtracking {
    
    public static void print(int n1, int n2) {
        if(n1<1)
        return;

        print(n1-1, n2);
        System.out.println(n1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(n, n);
    }
        
        

}
