package ClassAndObj;

public class Rectangle {

    int length;
    int width;

    public void calculateArea() {
    	System.err.println("Rectangle Area");
        int area = length * width;
        System.out.println("Area = " + area);
    }
}