package Methods;

public class Employee {

    double calculateSalary(double basic) {
        return basic + (basic * 20 / 100) + (basic * 10 / 100);
    }
}