package Constructor;

public class Employee {
	String name;
	float salary;

	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	void calSal() {
		float bonus = salary * 0.20f;
		float totalSalary = bonus + salary;
		System.out.println("Name : " + name);
		System.out.println("Total Salary With " + bonus + " Bonus : " + totalSalary);
	}
}
