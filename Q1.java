package com.PracticeQuestion;

public class Q1 {
	int bill;

	int calculateElectricityBill(int units) {
		if (units <= 100) {
			bill += units * 5;
		} else if (units >= 100 && units <= 200) {
			bill += units * 7;
		} else {
			bill += units * 10;
		}

		return bill;
	}

}
