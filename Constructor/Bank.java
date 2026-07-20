package Constructor;

import java.util.*;

public class Bank {
	int accno;
	float bal;
	Scanner sc = new Scanner(System.in);

	public Bank(int accno, float bal) {
		this.accno = accno;
		this.bal = bal;

	}

	public void deposit() {
		System.out.println("Enter Amount u want to deposit");
		int amt = sc.nextInt();
		bal += amt;
	}

	public void withdraw() {
		System.out.println("Enter Amount u want to withdraw");
		int amt = sc.nextInt();
		if (amt > bal) {
			System.out.println("insufficent balance");
		} else {
			System.out.println(bal -= amt);
		}

	}

	public void display() {
		System.out.println("Avaliable Balance : " + bal);
	}

}
