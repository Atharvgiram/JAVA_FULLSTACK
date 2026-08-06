package OopPractice;

public class Student extends LUser {

    @Override
    public void issueBook(String bookName, int days) {

        setBookName(bookName);
        setDays(days);

        System.out.println("Book Issued to Student");
        System.out.println("Book Name : " + getBookName());
        System.out.println("Days : " + getDays());

        calculateFine();
    }

    @Override
    public void calculateFine() {

        if (getDays() > 7) {
            int fine = (getDays() - 7) * 5;
            System.out.println("Fine : ₹" + fine);
        } else {
            System.out.println("No Fine");
        }
    }
}