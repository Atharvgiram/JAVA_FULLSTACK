package com.MethodOverride;

public class Penguin extends Bird {
	@Override
	void fly() {
		System.out.println("Penguin cannot fly");
	}
}