package Constructor;

public class Prime {
    int num;

    public Prime(int num) {
        this.num = num;
    }

    public void check() {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}