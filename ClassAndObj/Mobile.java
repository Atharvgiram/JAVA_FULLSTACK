package ClassAndObj;

public class Mobile {

    String brand;
    int ram;
    double price;

    public void displaySpec() {
    	System.err.println("Mobile Details");
        System.out.println("Brand ----> " + brand);
        System.out.println("RAM ----> " + ram + " GB");
        System.out.println("Price ----> " + price);
    }
}