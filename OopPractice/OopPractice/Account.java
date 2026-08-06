package OopPractice;

public abstract class Account implements Transaction {
	private double balance;
	private int pin;

	public Account(double balance, int pin) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public final boolean verify(int pinEnter) {
		return this.pin == pinEnter;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Deposited: ₹" + amount);
		}
	}

	public abstract void withdraw(double amount);

}
