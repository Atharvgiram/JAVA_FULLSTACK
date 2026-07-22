package com.Polymorphism;

public class Convert {
	void convert(float c) {
		System.out.println("Fahrenheit = " + ((c * 9 / 5) + 32));
	}

	void convert(int f) {
		System.out.println("Celsius = " + ((f - 32) * 5 / 9));
	}
}
