package OopPractice;

public abstract class EUser implements Exam {

	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public abstract void calculateResult();
}