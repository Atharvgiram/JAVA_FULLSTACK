package com.MethodOverride;

public class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle = 3.14 * r * r");
    }
}