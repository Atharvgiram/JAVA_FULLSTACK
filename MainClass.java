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
	

       

        // Q11 Area (Method Overloading)
        Area area = new Area();
        area.area(5.0);
        area.area(10, 20);
        area.area(10, 8, 1);

        // Q12 Addition (Method Overloading)
        Addition add = new Addition();
        add.add(10, 20);
        add.add(10, 20, 30);
        add.add(10.5, 20.5);

        // Q13 Inheritance
        Car car = new Car();
        car.start();
        car.showSpeed();

        // Q14 Employee & Manager
        Manager manager = new Manager();
        manager.totalSalary();
    }
    }
