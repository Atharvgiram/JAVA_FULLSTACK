package com.PracticeQuestion;

public class BankAccount {

    private int balance = 5000;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {

        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");

    }

    public int getBalance() {
        return balance;
    }
}