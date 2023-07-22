package org.example.lesson7.data;

public class Complex{

    public double a;
    public double b;

    public Complex(double num1, double num2) {
        a = num1;
        b = num2;
    }
    @Override
    public String toString() {
        return String.format("%f + %fi", a, b);
    }
}

