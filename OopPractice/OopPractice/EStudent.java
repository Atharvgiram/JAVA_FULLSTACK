package OopPractice;

public class EStudent extends EUser {

	@Override
	public void exam(int marks) {

		setMarks(marks);

		System.out.println("Student Appeared for Exam");
		System.out.println("Marks : " + getMarks());

		calculateResult();
	}

	@Override
	public void calculateResult() {

		if (getMarks() >= 35) {
			System.out.println("Result : Pass");
		} else {
			System.out.println("Result : Fail");
		}
	}
}