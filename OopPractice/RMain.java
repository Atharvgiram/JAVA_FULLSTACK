package OopPractice;

public class RMain {

    public static void main(String[] args) {

        Chef chef = new Chef();
		Waiter waiter = new Waiter();

        chef.takeOrder("Paneer Butter Masala", 2);

        System.out.println("------------------------");

        waiter.takeOrder("Veg Biryani", 3);
    }
}