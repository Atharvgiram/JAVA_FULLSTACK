package Interface;

public class Acer implements Laptop {

    @Override
    public void specification() {

        System.out.println("Processor : Ryzen 7");
        System.out.println("RAM : 32GB");
        System.out.println("SSD : 2TB");

    }

}