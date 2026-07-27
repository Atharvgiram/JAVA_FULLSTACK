package com.PracticeQuestion;

public class Area {

    void area(double radius) {
        System.out.println("Circle = " + (3.14 * radius * radius));
    }

    void area(int l, int b) {
        System.out.println("Rectangle = " + (l * b));
    }

    void area(int base, int height, int x) {
        System.out.println("Triangle = " + (base * height / 2));
    }
}