package Constructor;

public class EvenOdd {
	int n;

	public EvenOdd(int n) {
		this.n = n;

	}

	public void check() {
		if (n % 2 == 0) {
			System.out.println(n + " Number is Even");

		} else {
			System.out.println(n + " Numer is Odd");
		}
	}
}
