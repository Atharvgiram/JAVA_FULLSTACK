package Constructor;

public class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void disp() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

}
