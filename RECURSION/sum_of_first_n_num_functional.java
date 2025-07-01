package BASIC_RECURSION;

public class sum_of_first_n_num_functional {
    
    public static int printsum(int n1) {
        if(n1==0){
            return 0;
        }
        return n1 + printsum(n1-1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(printsum(n));    }
}
