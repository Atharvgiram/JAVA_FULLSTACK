package Constructor;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student("Atharv", 91.8f);
		s.disp();
		System.out.println("------------------------------------------------------------------------------");
		Rectangle r = new Rectangle(8, 12);
		r.disp();
		System.out.println("------------------------------------------------------------------------------");
		Employee e = new Employee("Atharv", 35000);
		e.calSal();
		System.out.println("------------------------------------------------------------------------------");
		Circle c = new Circle(6);
		c.area();
		c.circ();
		System.out.println("------------------------------------------------------------------------------");
		Intrest i = new Intrest(85000, 6, 2);
		i.calSI();
		System.out.println("------------------------------------------------------------------------------");
		EvenOdd n = new EvenOdd(8);
		n.check();
		System.out.println("------------------------------------------------------------------------------");
		Temperature t = new Temperature(5);
		t.conv();
		System.out.println("------------------------------------------------------------------------------");
		Bank b = new Bank(23456765, 50000f);
		b.deposit();
		b.withdraw();
		b.display();
		System.out.println("------------------------------------------------------------------------------");
		Product p = new Product(1500);
		p.discount();
		System.out.println("------------------------------------------------");

		StudentGrade st = new StudentGrade(82);
		st.grade();
		System.out.println("------------------------------------------------");

		Reverse rev = new Reverse(12345);
		rev.rev();
		System.out.println("------------------------------------------------");

		Palindrome p1 = new Palindrome(121);
		p1.check();
		System.out.println("------------------------------------------------");

		Power pw = new Power(2, 5);
		pw.calPower();
		System.out.println("------------------------------------------------");

		Maximum m = new Maximum(45, 80, 62);
		m.max();
		System.out.println("------------------------------------------------");

		ATM a = new ATM(5000);
		a.deposit(2000);
		a.withdraw(1500);
		a.checkBalance();
		System.out.println("------------------------------------------------");

		Cart ca = new Cart(1200, 5);
		ca.bill();
		System.out.println("------------------------------------------------");

		ElectricityBill el = new ElectricityBill(180);
		el.calculate();
		System.out.println("------------------------------------------------");

		Fibonacci f = new Fibonacci(10);
		f.printSeries();
		System.out.println();
		System.out.println("------------------------------------------------");

		Prime pr = new Prime(17);
		pr.check();
		System.out.println("------------------------------------------------");

		Library l = new Library("Java Programming", false);
		l.issueBook();
		l.issueBook();
		l.returnBook();
		l.returnBook();
		System.out.println("------------------------------------------------");

	}
}
