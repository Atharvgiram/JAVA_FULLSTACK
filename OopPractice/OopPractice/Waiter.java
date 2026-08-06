package OopPractice;

public class Waiter extends Person {

    @Override
    public void takeOrder(String orderName, int quantity) {

        setOrderName(orderName);
        setQuantity(quantity);

        System.out.println("Waiter Took Order");
        System.out.println("Order : " + getOrderName());
        System.out.println("Quantity : " + getQuantity());

        handleOrder();
    }

    @Override
    public void handleOrder() {

        System.out.println("Serving " + getQuantity() + " " + getOrderName());
    }
}