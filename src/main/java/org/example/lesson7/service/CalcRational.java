package org.example.lesson7.service;

import org.example.lesson7.data.Rational;
import org.example.lesson7.log.Log;
import org.example.lesson7.service.operationRat.*;

public class CalcRational {
    public static void operationRat(Object rational1, Object rational2, String operation, Log log) {
        switch (operation.charAt(0)) {
            case ('+') -> {
                System.out.printf("%s + %s = %s" + "\n", rational1, rational2, Rsum.sum((Rational) rational1, (Rational) rational2));
                log.addLog(String.format("%s + %s = %s" + "\n", rational1, rational2, Rsum.sum((Rational) rational1, (Rational) rational2)));
            }
            case ('-') -> {
                System.out.printf("%s - %s = %s" + "\n", rational1, rational2, Rsub.sub((Rational) rational1, (Rational) rational2));
                log.addLog(String.format("%s - %s = %s" + "\n", rational1, rational2, Rsub.sub((Rational) rational1, (Rational) rational2)));
            }
            case ('*') -> {
                System.out.printf("%s * %s = %s" + "\n", rational1, rational2, Rmulti.multi((Rational) rational1, (Rational) rational2));
                log.addLog(String.format("%s * %s = %s" + "\n", rational1, rational2, Rmulti.multi((Rational) rational1, (Rational) rational2)));
            }
            case ('/') -> {
                System.out.printf("%s : %s = %s" + "\n", rational1, rational2, Rdiv.div((Rational) rational1, (Rational) rational2));
                log.addLog(String.format("%s : %s = %s" + "\n", rational1, rational2, Rdiv.div((Rational) rational1, (Rational) rational2)));
            }
        }
    }
}
