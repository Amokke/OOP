package org.example.lesson7.service.operationRat;

import org.example.lesson7.data.Rational;

public class Rdiv {
    public static Rational div(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num2, number2.num2 * number.num1);
    }
}
