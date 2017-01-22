package com.chandni.reddit.fraction;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testSimplifyFractionGivesFraction() throws Exception {
        Fraction testFraction = new Fraction(4, 8);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(1, 2), testSimplified);
    }
}