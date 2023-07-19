package org.example.lesson6.hw.service;

import org.example.lesson6.hw.data.Complex;

public class CalcCom {


    public Complex sum(Complex number, Complex number2){
        return new Complex(number.a + number2.a, number.b + number2.b);
    }


    public Complex sub(Complex number, Complex number2){
        return new Complex(number.a - number2.a, number.b - number2.b);
    }


    public Complex multi(Complex number, Complex number2){
        return new Complex((number.a * number2.a) - (number.b * number2.b),
                (number.b * number2.a) + (number2.b * number.a));
    }


    public Complex div(Complex number, Complex number2){
        return new Complex((number.a * number2.a + number.b * number2.b) /
                (number2.a * number2.a + number2.b * number2.b),
                (number.b * number2.a - number.a * number2.b) /
                        (number2.a * number2.a + number2.b * number2.b));
    }
}
