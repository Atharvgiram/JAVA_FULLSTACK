package Constructor;

public class StudentGrade {
    int marks;

    public StudentGrade(int marks) {
        this.marks = marks;
    }

    public void grade() {
        if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 35) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}