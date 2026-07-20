package Constructor;

public class Palindrome {
    int num;

    public Palindrome(int num) {
        this.num = num;
    }

    public void check() {
        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        if (reverse == num) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}