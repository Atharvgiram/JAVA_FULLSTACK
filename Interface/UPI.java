package Interface;

public class UPI implements Payment {

	@Override
	public void pay(int amount) {

		System.out.println("Payment Successful");
		System.out.println("Amount = " + amount);

	}

}