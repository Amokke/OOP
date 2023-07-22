package org.example.lesson7.controller;

import org.example.lesson7.controller.complex.CreateComp;
import org.example.lesson7.controller.complex.DoingComp;
import org.example.lesson7.controller.rational.CreateRat;
import org.example.lesson7.controller.rational.DoingRat;
import org.example.lesson7.data.Complex;
import org.example.lesson7.data.Rational;
import org.example.lesson7.log.Log;

public class Controller {

    public static Object constructor(String type, Log log) {
        switch (type) {
            case ("Complex") -> {
                Complex complex = CreateComp.createComplex();
                        return complex;
            }
            case ("Rational") -> {
                Rational racial = CreateRat.createRacial();
                return racial;

            }
        }
        return null;
    }
        public static void doing(Log log, String type){
            switch (type) {
                case ("Complex") -> DoingComp.doingComplex(log, type);
                case ("Rational") -> DoingRat.doingRac(log, type);
            }

        }

}
