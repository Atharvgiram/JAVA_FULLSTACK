package Methods;

public class ATM {
	double balance = 10000;

	void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	void withdrawAmount(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successful");
			System.out.println("Remaining Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

}
