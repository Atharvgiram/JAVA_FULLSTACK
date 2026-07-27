package com.PracticeQuestion;

public class MainClass {
	public static void main(String[] args) {
		Q1 q = new Q1();
		ArmStrong a = new ArmStrong();
		System.out.println(q.calculateElectricityBill(1115));
		System.out.println("----------------------------------------------------");
		System.out.println(a.isArmstrong(153));
		System.out.println("----------------------------------------------------");
		Student s = new Student();
		s.data();
		System.out.println("----------------------------------------------------");
	}

}
