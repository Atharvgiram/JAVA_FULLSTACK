package OopPractice;

public class Current extends Account {

	public Current(double balance, int pin) {
		super(balance, pin);
	}

	@Override
	public void withdraw(double amount) {

		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Current Withdrawal Successful");
		} else {
			System.out.println("Insufficient Balance");
			System.out.println("Available Balance: " + getBalance());
			System.out.println("Withdrawal Amount: " + amount);
		}
	}
}