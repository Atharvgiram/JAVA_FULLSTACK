package Methods;

public class Library {

    void issueBook(String bookName, boolean isAvailable) {
        if (isAvailable)
            System.out.println(bookName + " Issued");
        else
            System.out.println(bookName + " Not Available");
    }
}