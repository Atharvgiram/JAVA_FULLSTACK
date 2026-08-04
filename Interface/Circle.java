package Interface;

public class Circle implements Shape {

	int radius = 5;

	@Override
	public void area() {

		double area = 3.14 * radius * radius;
		System.out.println("Area = " + area);

	}

}