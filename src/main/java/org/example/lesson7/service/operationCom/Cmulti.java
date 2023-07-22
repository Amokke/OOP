package org.example.lesson7.service.operationCom;

import org.example.lesson7.data.Complex;

public class Cmulti {
    public static Complex multi(Complex number, Complex number2) {
        return new Complex((number.a * number2.a) - (number.b * number2.b),
                (number.b * number2.a) + (number2.b * number.a));
    }
}