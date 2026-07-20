package Constructor;

public class ElectricityBill {
    int units;

    public ElectricityBill(int units) {
        this.units = units;
    }

    public void calculate() {
        float bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = units * 7;
        } else {
            bill = units * 10;
        }

        System.out.println("Electricity Bill : " + bill);
    }
}