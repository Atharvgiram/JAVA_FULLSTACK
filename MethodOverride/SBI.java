package com.MethodOverride;

public class SBI extends Bank {
	@Override
	void getInterestRate() {
		System.out.println("SBI Interest Rate = 7%");
	}
}