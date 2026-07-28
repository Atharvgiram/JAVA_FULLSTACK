package com.MethodOverride;

public class Manager extends Employee {
	@Override
	void calculateSalary() {
		System.out.println("Manager Salary = 50000");
	}
}
