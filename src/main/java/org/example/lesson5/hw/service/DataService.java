package org.example.lesson5.hw.service;

import org.example.lesson5.hw.data.Complex;
import org.example.lesson5.hw.data.Rational;

public class DataService {


    public Rational sum(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 + number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 + number.num1, number2.num2 * number.num2);
        }
    }

    public Complex sum(Complex number, Complex number2){
        return new Complex(number.a + number2.a, number.b + number2.b);
    }

    public Rational sub(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 - number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 - number.num1, number2.num2 * number.num2);
        }
    }

    public Complex sub(Complex number, Complex number2){
        return new Complex(number.a - number2.a, number.b - number2.b);
    }

    public Rational multi(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num1, number2.num2 * number.num2);
    }

    public Complex multi(Complex number, Complex number2){
        return new Complex((number.a * number2.a) - (number.b * number2.b),
                (number.b * number2.a) + (number2.b * number.a));
    }

    public Rational div(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num2, number2.num2 * number.num1);
    }

    public Complex div(Complex number, Complex number2){
        return new Complex((number.a * number2.a + number.b * number2.b) /
                (number2.a * number2.a + number2.b * number2.b),
                (number.b * number2.a - number.a * number2.b) /
                        (number2.a * number2.a + number2.b * number2.b));
    }

}
