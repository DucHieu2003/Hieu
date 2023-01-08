package btvn_2;

import java.lang.Number;

public class Fraction {
    public int numerator;
    public int denominator;
    public Fraction(Fraction fruction) {
        this.numerator = fruction.numerator;
        this.denominator = fruction.denominator;
    }
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

}
