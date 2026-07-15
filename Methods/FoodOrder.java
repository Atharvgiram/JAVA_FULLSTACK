package Methods;

public class FoodOrder {

    void placeOrder(String item, int quantity) {
        System.out.println("Item : " + item);
        System.out.println("Bill : " + (quantity * 100));
    }
}