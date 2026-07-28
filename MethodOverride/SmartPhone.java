package com.MethodOverride;

public class SmartPhone extends Mobile {
	@Override
	void features() {
		System.out.println("Calling, SMS, Internet");
	}
}