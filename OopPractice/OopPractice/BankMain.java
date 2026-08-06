package OopPractice;

public class BankMain {
	public static void main(String[] args) {

		Saving s = new Saving(10000, 1234);
		Current c = new Current(5000, 5678);

		if (s.verify(1234)) {
			s.deposit(2000);
			s.withdraw(3000);
			System.out.println("Savings Balance: ₹" + s.getBalance());
		} else {
			System.out.println("Invalid Savings PIN");
		}

		System.out.println();

		if (c.verify(5678)) {
			c.deposit(1000);
			c.withdraw(9000);
			System.out.println("Current Balance: ₹" + c.getBalance());
		} else {
			System.out.println("Invalid Current PIN");
		}
	}
}
