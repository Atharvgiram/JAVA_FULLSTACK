package com.Polymorphism;

public class Maximum {

    void max(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    void max(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println(max);
    }
}
