package com.Polymorphism;

public class Student {

	int id;
	String name;

	Student() {

	}

	Student(int i) {
		id = i;
	}

	Student(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}
}