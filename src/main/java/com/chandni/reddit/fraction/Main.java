package com.chandni.reddit.fraction;

public class Main {
    public static void main(String[] args) {
        FractionSimplifyer.go();
        Fraction fraction = new Fraction(4, 8);
        System.out.println(fraction.simplify().toString());
    }
}
