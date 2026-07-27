package com.PracticeQuestion;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int a = sc.nextInt();

		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();

		char ch = '+';

		switch (ch) {

		case '+':
			System.out.println(a + b);
			break;

		case '-':
			System.out.println(a - b);
			break;

		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		default:
			System.out.println("Invalid Operator");

		}

		sc.close();
	}
}