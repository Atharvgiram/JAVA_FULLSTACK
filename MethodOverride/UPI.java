package com.MethodOverride;

public class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}