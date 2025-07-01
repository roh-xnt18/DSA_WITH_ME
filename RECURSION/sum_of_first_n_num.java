package BASIC_RECURSION;

public class sum_of_first_n_num {
    
    // Parameterized method

    public static void printsum(int n1, int sum) {
        if(n1<1){
            System.out.println(sum);
            return;
        }
        printsum(n1-1, sum+n1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printsum(n, 0);
    }
    
}
