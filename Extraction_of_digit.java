package BASIC_MATHS;

public class Extraction_of_digit {
    public static void main(String[] args) {
        int N = 7789;
        while(N>0) {
            int lastdigit = N%10;
            N= N/10;
            System.out.println(lastdigit);
        }
    }
}
