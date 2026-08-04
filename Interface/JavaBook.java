package Interface;

public class JavaBook implements Book {

    @Override
    public void details() {

        System.out.println("Book Name : Core Java");
        System.out.println("Author : James Gosling");
        System.out.println("Price : 500");

    }

}