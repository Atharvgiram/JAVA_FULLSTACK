package Constructor;

public class Reverse {
    int num;

    public Reverse(int num) {
        this.num = num;
    }

    public void rev() {
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse Number : " + reverse);
    }
}