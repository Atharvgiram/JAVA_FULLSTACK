package com.PracticeQuestion;

import java.util.Scanner;

public class ProductBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Product Name: ");
        String name = sc.nextLine();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Price: ");
        int price = sc.nextInt();

        double bill = qty * price;

        if (bill > 5000)
            bill = bill - (bill * 10 / 100);

        System.out.println("Final Bill = " + bill);

        sc.close();
    }
}
