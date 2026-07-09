package ClassAndObj;

public class Circle {

    double radius;

    public void area() {
    	System.err.println("Circle Area");
        double area = 3.14 * radius * radius;
        System.out.println("Area = " + area);
    }
}