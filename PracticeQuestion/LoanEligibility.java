package com.PracticeQuestion;

import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Salary: ");
        int salary = sc.nextInt();

        System.out.print("Age: ");
        int age = sc.nextInt();

        if (salary > 25000 && age >= 21 && age <= 60)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");

        sc.close();
    }
}