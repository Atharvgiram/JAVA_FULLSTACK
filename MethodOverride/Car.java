package com.MethodOverride;

public class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car starts with key");
	}
}
