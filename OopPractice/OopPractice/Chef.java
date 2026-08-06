package OopPractice;

public class Chef extends Person {

    @Override
    public void takeOrder(String orderName, int quantity) {

        setOrderName(orderName);
        setQuantity(quantity);

        System.out.println("Chef Received Order");
        System.out.println("Order : " + getOrderName());
        System.out.println("Quantity : " + getQuantity());

        handleOrder();
    }

    @Override
    public void handleOrder() {

        System.out.println("Preparing " + getQuantity() + " " + getOrderName());
    }
}