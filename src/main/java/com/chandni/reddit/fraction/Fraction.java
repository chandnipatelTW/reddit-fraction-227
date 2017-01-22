package com.chandni.reddit.fraction;

public class Fraction {

    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction simplify() {
        for (int i = numerator; i > 1; i--) {
            if (isEvenlyDivisible(i, denominator) && isEvenlyDivisible(i, numerator)) {
                numerator = numerator/i;
                denominator = denominator/i;
                break;
            }
        }
        return new Fraction(numerator, denominator);
    }

    private boolean isEvenlyDivisible(int testFactor, Integer number) {
        return number % testFactor == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (!numerator.equals(fraction.numerator)) return false;
        return denominator.equals(fraction.denominator);

    }

    @Override
    public int hashCode() {
        int result = numerator.hashCode();
        result = 31 * result + denominator.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
