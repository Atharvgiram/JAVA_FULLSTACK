package Constructor;

public class Library {
    String bookName;
    boolean isIssued;

    public Library(String bookName, boolean isIssued) {
        this.bookName = bookName;
        this.isIssued = isIssued;
    }

    public void issueBook() {
        if (isIssued) {
            System.out.println("Book Already Issued");
        } else {
            isIssued = true;
            System.out.println("Book Issued Successfully");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book Returned Successfully");
        } else {
            System.out.println("Book Already Available");
        }
    }
}