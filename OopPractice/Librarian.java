package OopPractice;

public class Librarian extends LUser {

    @Override
    public void issueBook(String bookName, int days) {

        setBookName(bookName);
        setDays(days);

        System.out.println("Book Issued by Librarian");
        System.out.println("Book Name : " + getBookName());
        System.out.println("Days : " + getDays());

        calculateFine();
    }

    @Override
    public void calculateFine() {

        if (getDays() > 10) {
            int fine = (getDays() - 10) * 2;
            System.out.println("Fine : ₹" + fine);
        } else {
            System.out.println("No Fine");
        }
    }
}