package com.TKA;

public class MainClass {

    public static void main(String[] args) {

        Library lib = new Library();
        Student stu = new Student();
        Hospital hos = new Hospital();
        Vehicle veh = new Vehicle();
        Employee emp = new Employee();

        lib.addBook();
        lib.displayDetails();

        System.out.println();

        stu.study();
        stu.attendClass();
        stu.displayDetails();

        System.out.println();

        hos.displayDetails();

        System.out.println();

        veh.displayDetails();

        System.out.println();

        emp.work();
        emp.displayDetails();
    }
}