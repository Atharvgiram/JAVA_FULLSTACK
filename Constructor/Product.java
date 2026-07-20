package Constructor;

public class Product {
    float price;

    public Product(float price) {
        this.price = price;
    }

    public void discount() {
        if (price > 1000) {
            price = price - (price * 10 / 100);
        }
        System.out.println("Final Price : " + price);
    }
}