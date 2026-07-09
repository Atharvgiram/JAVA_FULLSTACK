package ClassAndObj;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1=new Student();
     
     s1.name="Atharv";
     s1.rollNo=48;
     s1.marks=85.8f;
     s1.display();
     
     Student s2=new Student();
     
     s2.name="Ram";
     s2.rollNo=49;
     s2.marks=84.8f;
     
     s2.display();
     
     
     System.out.println("-----------------------------------");
     
     Employee e = new Employee();
     e.name = "Rahul";
     e.salary = 50000;
     e.showDetails();
     
     System.out.println("-----------------------------------");
     
     Car c = new Car();
     c.brand = "Toyota";
     c.model = "Fortuner";
     c.price = 4500000;
     c.showCar();

	 Car c2 = new Car();
     c2.brand = "Land Rover";
     c2.model = "Defender";
     c2.price = 9999999;
     c2.showCar();
     
     System.out.println("-----------------------------------");

     Mobile m = new Mobile();
     m.brand = "Samsung";
     m.ram = 8;
     m.price = 25000;
     m.displaySpec();

     System.out.println("-----------------------------------");
     
     
     Rectangle r = new Rectangle();
     r.length = 10;
     r.width = 5;
     r.calculateArea();
     
     System.out.println("-----------------------------------");

     Circle c1 = new Circle();
     c1.radius = 7;
     c1.area();
     
     System.out.println("-----------------------------------");

     BankAccount b = new BankAccount();
     b.accountNumber = 1234567890L;
     b.balance = 50000;
     b.displayBalance();

     System.out.println("-----------------------------------");
     
     Book bk = new Book();
     bk.title = "Java Programming";
     bk.author = "James";
     bk.price = 550;
     bk.showBook();
     
     System.out.println("-----------------------------------");
     
     

     Laptop l = new Laptop();
     l.brand = "Dell";
     l.processor = "Intel i5";
     l.price = 65000;
     l.showDetails();
     
     System.out.println("-----------------------------------");

     ATM atm = new ATM();
     atm.balance = 12000;
     atm.checkBalance();

     
     
	}

}
