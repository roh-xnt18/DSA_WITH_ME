package BASIC_RECURSION;

public class CheckPalindrome {

    public static boolean check(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return check(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "madam";
        boolean palindrome = check(0, s);

        if (palindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
