package Interface;

public class BoiAtm implements ATM {
	int bal = 2000;

	@Override
	public void deposit(int b) {
		bal += b;
		System.out.println("Avaliable Balance " + bal);

	}

}
