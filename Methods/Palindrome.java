package Methods;

public class Palindrome {

    boolean isPalindrome(int num) {
        int temp = num, rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return temp == rev;
    }
}