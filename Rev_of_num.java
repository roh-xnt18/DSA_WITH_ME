package BASIC_MATHS;

public class Rev_of_num {
    public static void main(String[] args) {
        long N = 552151345;
        long rev = 0;
        while(N>0){
            long lastdigit = N%10;
            rev = rev*10+lastdigit;
            N = N/10;
        }
        System.out.println("Reversed number is : " + rev);
    }
}
