package com.chandni.reddit.fraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Fraction fraction = new Fraction(4, 8);
        System.out.println(fraction.simplify().toString());
    }
}
