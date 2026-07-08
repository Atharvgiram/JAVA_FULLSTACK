package com.TKA;

public class Student {

    int rollNo = 1;
    String name = "Atharv";
    int age = 21;
    String gender = "Male";
    String course = "BBA CA";
    String address = "Pune";
    String mobile = "9876543210";
    String email = "atharv@gmail.com";
    double fees = 45000;
    String division = "A";

    void study() {
        System.out.println("Student is Studying.");
    }

    void attendClass() {
        System.out.println("Student is Attending Class.");
    }

    void displayDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Course : " + course);
        System.out.println("Address : " + address);
        System.out.println("Mobile : " + mobile);
        System.out.println("Email : " + email);
        System.out.println("Fees : " + fees);
        System.out.println("Division : " + division);
    }
}