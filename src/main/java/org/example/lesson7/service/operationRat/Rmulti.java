package org.example.lesson7.service.operationRat;

import org.example.lesson7.data.Rational;

public class Rmulti {
    public static Rational multi(Rational number, Rational number2){
        return new Rational(number2.num1 * number.num1, number2.num2 * number.num2);
    }
}
