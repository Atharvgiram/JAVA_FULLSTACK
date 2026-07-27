package com.PracticeQuestion;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);

	void data() {
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter Marks of 3 Subj");
		int n1, n2, n3 = sc.nextInt();
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		float avg = n1 + n2 + n3 / 300;
		System.out.println("Name " + name + " " + "Average " + avg);
		if (avg > 75) {
			System.out.println("Grade A");
		} else if (avg > 60 && avg < 75) {
			System.out.println("Grade B");

		} else if (avg > 40 && avg < 60) {
			System.out.println("Grade C");

		} else {
			System.out.println("Fail");
		}
	}

}
