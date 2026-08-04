package Interface;

public class MyCalculator implements Calculator {

    @Override
    public void add(int a, int b) {

        System.out.println("Addition = " + (a + b));

    }

}