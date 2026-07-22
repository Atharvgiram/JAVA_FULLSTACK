package com.Polymorphism;

public class MainClass {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);

		Multiply m = new Multiply();
		m.multiply(5, 4);
		m.multiply(2.5, 3.5);

		Area a = new Area();
		a.area(5);
		a.area(10, 20);

		Display d = new Display();
		d.display(100);
		d.display("Atharv");

		Sum s = new Sum();
		s.sum(10, 20);
		s.sum(10.5f, 20.5f);

		Demo dm = new Demo();
		dm.show(1, "Atharv");
		dm.show("Ram", 2);

		Student s1 = new Student();
		Student s2 = new Student(101);
		Student s3 = new Student(102, "Atharv");

		s1.display();
		s2.display();
		s3.display();

		PrintDemo.print(10);
		PrintDemo.print(10, 20);

		MainDemo.main(100);

		Calculate cal = new Calculate();
		cal.calculate(5);
		cal.calculate(5, 1);

		Maximum mx = new Maximum();
		mx.max(10, 20);
		mx.max(10, 30, 25);

		Details dt = new Details();
		dt.details("Atharv");
		dt.details("Atharv", 21);

		Convert cv = new Convert();
		cv.convert(25.0f);
		cv.convert(98);

		Login l = new Login();
		l.login("Atharv");
		l.login("Atharv", "12345");
	}
}
