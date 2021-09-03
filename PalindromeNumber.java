/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12321;
        boolean plinderom = isPalindrome(n);
        System.out.println(plinderom);
    }

    public static boolean isPalindrome(int n){

        if(n == 0){
            return true;
        }
        if(n < 0 || n % 10 == 0){
            return false;
        }

        int palindrome = 0;
        while (n > palindrome ){
            palindrome = palindrome * 10 + n % 10;
            System.out.println(palindrome);
            n /= 10;

        }
        return n == palindrome || n == palindrome/10;
    }
}
