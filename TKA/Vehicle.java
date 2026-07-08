package com.TKA;
public class Vehicle {

    int vehicleId = 301;
    String vehicleName = "Honda City";
    String model = "2025";
    String color = "White";
    double price = 1500000;

    void displayDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }
}