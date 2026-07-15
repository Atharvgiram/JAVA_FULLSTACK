package Methods;

public class EvenOdd {

    void countEvenOdd(int arr[]) {
        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}