package com.Polymorphism;

public class Area {

    void area(double r) {
        System.out.println("Circle Area = " + (3.14 * r * r));
    }

    void area(int l, int b) {
        System.out.println("Rectangle Area = " + (l * b));
    }
}