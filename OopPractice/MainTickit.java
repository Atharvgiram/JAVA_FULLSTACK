package OopPractice;

public class MainTickit {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Admin admin = new Admin();

		customer.bookTicket("Avengers", 2);

		System.out.println();

		admin.bookTicket("Pushpa 2", 4);
	}
}