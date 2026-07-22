package com.Polymorphism;

public class Calculate {

    void calculate(int a) {
        System.out.println("Square = " + (a * a));
    }

    void calculate(int a, int b) {
        System.out.println("Cube = " + (a * a * a));
    }
}