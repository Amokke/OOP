package org.example.lesson7.service.operationCom;

import org.example.lesson7.data.Complex;

public class Csum {
    public static Complex sum(Complex number, Complex number2){
        return new Complex(number.a + number2.a, number.b + number2.b);
    }
}
