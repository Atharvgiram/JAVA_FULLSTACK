package Constructor;

public class Circle {
	float pi = 3.14f;
	float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	public void area() {
		float area = pi * radius * radius;
		System.out.println("Area of Circle is : " + area);
	}

	public void circ() {
		float circ = 2 * pi * radius;
		System.out.println("Circumference of Circle is : " + circ);

	}
}
