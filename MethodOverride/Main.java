package com.MethodOverride;

public class Main {
	public static void main(String[] args) {

		Animal a = new Dog();
		a.sound();
		System.out.println("---------------------------------------------");
		Vehicle v = new Car();
		v.start();
		System.out.println("---------------------------------------------");
		Employee e = new Manager();
		e.calculateSalary();
		System.out.println("---------------------------------------------");
		Bank b = new SBI();
		b.getInterestRate();
		System.out.println("---------------------------------------------");
		Shape s = new Circle();
		s.area();
		System.out.println("---------------------------------------------");
		Student st = new Topper();
		st.result();
		System.out.println("---------------------------------------------");
		Bird bd = new Penguin();
		bd.fly();
		System.out.println("---------------------------------------------");
		Mobile m = new SmartPhone();
		m.features();
		System.out.println("---------------------------------------------");
		Payment p = new UPI();
		p.pay();
		System.out.println("---------------------------------------------");
		Hospital h = new DentalHospital();
		h.treatment();

	}
}