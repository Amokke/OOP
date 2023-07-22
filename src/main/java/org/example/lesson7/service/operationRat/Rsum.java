package org.example.lesson7.service.operationRat;

import org.example.lesson7.data.Rational;

public class Rsum {
    public static Rational sum(Rational number, Rational number2){
        if (number.num2 == number2.num2){
            return new Rational(number2.num1 + number.num1, number2.num2);
        } else {
            return new Rational(number2.num1 + number.num1, number2.num2 * number.num2);
        }
    }
}
