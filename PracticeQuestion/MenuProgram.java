package com.PracticeQuestion;

import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.Even Odd");
		System.out.println("2.Prime");
		System.out.println("3.Reverse");

		int choice = sc.nextInt();

		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		switch (choice) {

		case 1:
			if (num % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
			break;

		case 2:

			int count = 0;

			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}

			if (count == 2)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");

			break;

		case 3:

			int rev = 0;

			while (num > 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}

			System.out.println(rev);

			break;

		default:
			System.out.println("Wrong Choice");

		}

		sc.close();
	}
}
