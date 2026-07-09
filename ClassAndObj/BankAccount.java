package ClassAndObj;

public class BankAccount {

	long accountNumber;
	double balance;

	public void displayBalance() {
		System.err.println("BANK Details");
		System.out.println("Account Number ----> " + accountNumber);
		System.out.println("Balance ----> " + balance);
	}
}