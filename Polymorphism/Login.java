package com.Polymorphism;

public class Login {

	void login(String username) {
		System.out.println("Username = " + username);
	}

	void login(String username, String password) {
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
	}
}
