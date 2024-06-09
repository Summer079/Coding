package TwoPointers;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder s = new StringBuilder(String.valueOf(x));
        return Long.parseLong(s.reverse().toString()) == x;
    }

    public static void main(String[] args) {
        Palindrome palindromeChecker = new Palindrome();
        
        // Example usage
        int number1 = 12321;
        int number2 = 12345;

        System.out.println(number1 + " is a palindrome: " + palindromeChecker.isPalindrome(number1));
        System.out.println(number2 + " is a palindrome: " + palindromeChecker.isPalindrome(number2));
    }
}
