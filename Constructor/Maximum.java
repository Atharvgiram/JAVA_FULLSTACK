package Constructor;

public class Maximum {
    int a, b, c;

    public Maximum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void max() {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("Largest Number : " + max);
    }
}