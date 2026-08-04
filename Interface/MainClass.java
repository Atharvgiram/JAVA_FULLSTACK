package Interface;

public class MainClass {
	public static void main(String[] args) {
		ATM a = new BoiAtm();
		a.deposit(500);
		System.out.println("---------------------------------------------------------------");
		Animal an = new Dog();
		an.sound();
		System.out.println("---------------------------------------------------------------");
		Vehicle v = new Car();
		v.start();
		System.out.println("---------------------------------------------------------------");
		Shape s = new Circle();
		s.area();
		System.out.println("---------------------------------------------------------------");
		Student si = new CollegeStudent();
		si.display();
		System.out.println("---------------------------------------------------------------");
		Employee e = new Manager();
		e.salary();
		System.out.println("---------------------------------------------------------------");
		Bank b = new SbiBank();
		b.withdraw(2000);
		System.out.println("---------------------------------------------------------------");
		Calculator c = new MyCalculator();
		c.add(10, 20);
		System.out.println("---------------------------------------------------------------");
		Printer p = new HPPrinter();
		p.printe();
		System.out.println("---------------------------------------------------------------");
		Mobile m = new Samsung();
		m.call();
		System.out.println("---------------------------------------------------------------");
		Fan f = new CeilingFan();
		f.on();
		System.out.println("---------------------------------------------------------------");
		Laptop l = new Acer();
		l.specification();
		System.out.println("---------------------------------------------------------------");
		Hospital h = new CityHospital();
		h.doctor();
		System.out.println("---------------------------------------------------------------");
		Payment upi = new UPI();
		upi.pay(1500);
		System.out.println("---------------------------------------------------------------");
		Book jb = new JavaBook();
		jb.details();

		System.out.println("---------------------------------------------------------------");
	}

}
