package OopPractice;

public abstract class Person implements OrderService {

	private String orderName;
	private int quantity;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public abstract void handleOrder();
}