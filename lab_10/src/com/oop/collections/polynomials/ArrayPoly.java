package com.oop.collections.polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        double[] poly = new double[coefficients.length];
        for (int i = 0; i <= poly.length; i++) {
            poly[i] = coefficient(i);
        }
        return poly;
    }
}

