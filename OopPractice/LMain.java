package OopPractice;

public class LMain {

    public static void main(String[] args) {

        Student student = new Student();
        Librarian librarian = new Librarian();

        student.issueBook("Java Programming", 10);

        System.out.println("------------------------");

        librarian.issueBook("Data Structures", 12);
    }
}