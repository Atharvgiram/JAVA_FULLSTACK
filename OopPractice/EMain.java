package OopPractice;

public class EMain {

	public static void main(String[] args) {

		EStudent student = new EStudent();
		EAdmin admin = new EAdmin();

		student.exam(40);

		System.out.println("------------------------");

		admin.exam(82);
	}
}