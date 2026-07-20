package Constructor;

public class ATM {
    float balance;

    public ATM(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }

    public void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
        }
    }

    public void checkBalance() {
        System.out.println("Available Balance : " + balance);
    }
}