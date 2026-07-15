package Methods;

public class MainClass {

    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.checkBalance();
        atm.withdrawAmount(2000);
        System.out.println("--------------------------------------------");

        StudentResult sr = new StudentResult();
        System.out.println(sr.calculatePercentage(80, 90, 85));
        System.out.println("--------------------------------------------");

        MobileRecharge mr = new MobileRecharge();
        mr.recharge(299);
        System.out.println("--------------------------------------------");

        Temperature t = new Temperature();
        System.out.println(t.celsiusToFahrenheit(25));
        System.out.println("--------------------------------------------");

        Login l = new Login();
        System.out.println(l.login("admin", "1234"));
        System.out.println("--------------------------------------------");

        Discount d = new Discount();
        System.out.println(d.calculateDiscount(1000));
        System.out.println("--------------------------------------------");

        Employee e = new Employee();
        System.out.println(e.calculateSalary(30000));
        System.out.println("--------------------------------------------");

        Interest i = new Interest();
        System.out.println(i.calculateInterest(10000, 8, 2));
        System.out.println("--------------------------------------------");

        FoodOrder fo = new FoodOrder();
        fo.placeOrder("Pizza", 2);
        System.out.println("--------------------------------------------");

        Electricity eb = new Electricity();
        System.out.println(eb.calculateBill(120));
        System.out.println("--------------------------------------------");

        Voting v = new Voting();
        v.vote(20);
        System.out.println("--------------------------------------------");

        Ride r = new Ride();
        System.out.println(r.calculateFare(15));
        System.out.println("--------------------------------------------");

        Password p = new Password();
        System.out.println(p.checkPassword("java1234"));
        System.out.println("--------------------------------------------");

        Library lib = new Library();
        lib.issueBook("Java", true);
        System.out.println("--------------------------------------------");

        Shopping s = new Shopping();
        System.out.println(s.calculateTotal(100, 200, 300));
        System.out.println("--------------------------------------------");

        Maximum m = new Maximum();
        System.out.println(m.findMax(10, 40, 30));
        System.out.println("--------------------------------------------");

        Prime pr = new Prime();
        System.out.println(pr.isPrime(13));
        System.out.println("--------------------------------------------");

        Palindrome pa = new Palindrome();
        System.out.println(pa.isPalindrome(121));
        System.out.println("--------------------------------------------");

        EvenOdd eo = new EvenOdd();
        int arr[] = {1, 2, 3, 4, 5, 6};
        eo.countEvenOdd(arr);
        System.out.println("--------------------------------------------");

        Grade g = new Grade();
        System.out.println(g.getGrade(82));
        System.out.println("--------------------------------------------");
    }
}