package Constructor;

public class Student {
	String name;
	float marks;

	public Student(String name, float marks) {
		this.name = name;
		this.marks = marks;
	}

	public void disp() {
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
		if (marks >= 35) {
			System.out.println(name + " IS  Pass with " + marks + " Marks ");

		} else {
			System.out.println(name + " IS  Fail with " + marks + " Marks ");
		}
	}
}
