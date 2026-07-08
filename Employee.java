package com.TKA;
public class Employee {

    int empId = 401;
    String empName = "Rahul";
    int age = 30;
    String gender = "Male";
    String department = "IT";
    String designation = "Software Engineer";
    double salary = 60000;
    String address = "Pune";
    String mobile = "9876543211";
    String email = "rahul@gmail.com";
    String companyName = "ABC Pvt Ltd";
    String joiningDate = "01-01-2024";

    void work() {
        System.out.println("Employee is Working.");
    }

    void displayDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Department : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + address);
        System.out.println("Mobile : " + mobile);
        System.out.println("Email : " + email);
        System.out.println("Company : " + companyName);
        System.out.println("Joining Date : " + joiningDate);
    }
}