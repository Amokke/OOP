package org.example.lesson7.service;

import org.example.lesson7.data.Complex;
import org.example.lesson7.log.Log;
import org.example.lesson7.service.operationCom.*;

public class CalcComplex {
    public static void operationCom(Object number1, Object number2, String operation, Log log) {
        switch (operation.charAt(0)) {
            case ('+') -> {
                System.out.printf("%s + %s = %s" + "\n", number1, number2, Csum.sum((Complex) number1, (Complex) number2));
                log.addLog(String.format("%s + %s = %s" + "\n", number1, number2, Csum.sum((Complex) number1, (Complex) number2)));
            }
            case ('-') -> {
                System.out.printf("%s - %s = %s" + "\n", number1, number2, Csub.sub((Complex) number1, (Complex) number2));
                log.addLog(String.format("%s - %s = %s" + "\n", number1, number2, Csub.sub((Complex) number1, (Complex) number2)));
            }
            case ('*') -> {
                System.out.printf("%s * %s = %s" + "\n", number1, number2, Cmulti.multi((Complex) number1, (Complex) number2));
                log.addLog(String.format("%s * %s = %s" + "\n", number1, number2, Cmulti.multi((Complex) number1, (Complex) number2)));
            }
            case ('/') -> {
                System.out.printf("%s : %s = %s" + "\n", number1, number2, Cdiv.div((Complex) number1, (Complex) number2));
                log.addLog(String.format("%s : %s = %s" + "\n", number1, number2, Cdiv.div((Complex) number1, (Complex) number2)));
            }
        }
    }
}
