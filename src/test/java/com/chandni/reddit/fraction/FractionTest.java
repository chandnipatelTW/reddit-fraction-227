package com.chandni.reddit.fraction;

import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testSimplify4EighthsFractionGivesOneHalfFraction() throws Exception {
        Fraction testFraction = new Fraction(4, 8);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(1, 2), testSimplified);
    }

    @Test
    public void testSimplify1536over78360Gives64over3265() throws Exception {
        Fraction testFraction = new Fraction(1536, 78360);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(64, 3265), testSimplified);
    }

    @Test
    public void testSimplify51478over5536GivesSolution() throws Exception {
        Fraction testFraction = new Fraction(51478, 5536);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(25739, 2768), testSimplified);
    }

    @Test
    public void testSimplify46410over119340Gives7over18() throws Exception {
        Fraction testFraction = new Fraction(46410, 119340);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(7, 18), testSimplified);
    }

    @Test
    public void testSimplify7673over4729DoesNothing() throws Exception {
        Fraction testFraction = new Fraction(7673, 4729);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(7673, 4729), testSimplified);
    }

    @Test
    public void testSimplify4096over1024Gives4over1() throws Exception {
        Fraction testFraction = new Fraction(4096, 1024);

        Fraction testSimplified = testFraction.simplify();
        System.out.printf(testSimplified.toString());

        assertEquals(new Fraction(4, 1), testSimplified);
    }
}