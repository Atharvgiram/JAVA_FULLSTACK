package Constructor;

public class Fibonacci {
    int terms;

    public Fibonacci(int terms) {
        this.terms = terms;
    }

    public void printSeries() {
        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}