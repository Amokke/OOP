package org.example.lesson7.service;


import org.example.lesson7.log.Log;

public class Calculate {
    public static void calcResult(String type, Object number1, Object number2, String operation, Log log) {
        switch (type) {
            case ("Complex") -> CalcComplex.operationCom(number1, number2, operation, log);
            case ("Rational") -> CalcRational.operationRat(number1, number2, operation, log);
        }
    }
}