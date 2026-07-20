package Constructor;

public class Cart {
    float price;
    int quantity;

    public Cart(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public void bill() {
        float total = price * quantity;

        if (total > 5000) {
            total = total - (total * 10 / 100);
        }

        System.out.println("Total Bill : " + total);
    }
}