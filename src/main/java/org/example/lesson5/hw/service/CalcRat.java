package org.example.lesson6.hw.service;

import org.example.lesson6.hw.data.Rational;

public class CalcRat {
    public Rational sum(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 + number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 + number.num1, number2.num2 * number.num2);
        }
    }

    public Rational sub(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 - number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 - number.num1, number2.num2 * number.num2);
        }
    }

    public Rational multi(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num1, number2.num2 * number.num2);
    }


    public Rational div(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num2, number2.num2 * number.num1);
    }

}
