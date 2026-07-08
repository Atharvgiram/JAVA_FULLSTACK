package com.TKA;

public class Hospital {

    int hospitalId = 201;
    String hospitalName = "City Hospital";
    String doctorName = "Dr. Patil";
    int totalBeds = 150;
    String location = "Pune";

    void displayDetails() {
        System.out.println("Hospital ID : " + hospitalId);
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Doctor : " + doctorName);
        System.out.println("Total Beds : " + totalBeds);
        System.out.println("Location : " + location);
    }
}