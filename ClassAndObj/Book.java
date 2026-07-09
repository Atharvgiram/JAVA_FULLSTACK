package ClassAndObj;

public class Book {

    String title;
    String author;
    double price;

    public void showBook() {
    	System.err.println("BooK Details");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}