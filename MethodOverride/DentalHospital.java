package com.MethodOverride;

public class DentalHospital extends Hospital {
    @Override
    void treatment() {
        System.out.println("Dental Treatment");
    }
}