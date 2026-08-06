package OopPractice;

public class EAdmin extends EUser {

	@Override
	public void exam(int marks) {

		setMarks(marks);

		System.out.println("Admin Published Result");
		System.out.println("Marks : " + getMarks());

		calculateResult();
	}

	@Override
	public void calculateResult() {

		if (getMarks() >= 75) {
			System.out.println("Grade : Distinction");
		} else if (getMarks() >= 60) {
			System.out.println("Grade : First Class");
		} else if (getMarks() >= 35) {
			System.out.println("Grade : Pass");
		} else {
			System.out.println("Grade : Fail");
		}
	}
}