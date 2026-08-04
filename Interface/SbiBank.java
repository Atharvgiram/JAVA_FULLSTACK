package Interface;

public class SbiBank implements Bank {

    int balance = 10000;

    @Override
    public void withdraw(int amount) {

        balance = balance - amount;
        System.out.println("Remaining Balance = " + balance);

    }

}