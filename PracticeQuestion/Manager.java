package com.PracticeQuestion;

public class Manager extends Employee {

	int bonus = 5000;

	void totalSalary() {
		System.out.println("Name = " + name);
		System.out.println("Total Salary = " + (salary + bonus));
	}
}