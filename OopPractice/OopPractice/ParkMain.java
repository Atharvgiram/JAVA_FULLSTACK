package OopPractice;

public class ParkMain {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		Truck truck = new Truck();
		car.park(112, 10);
		car.charges();
		bike.park(11, 8);
		bike.charges();
		truck.park(804, 8);
		truck.charges();

	}
}
