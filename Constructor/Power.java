package Constructor;

public class Power {
    int base, exponent;

    public Power(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public void calPower() {
        int power = 1;

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println("Power : " + power);
    }
}