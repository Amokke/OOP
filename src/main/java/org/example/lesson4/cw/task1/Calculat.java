package org.example.lesson4.cw.task1;

import java.util.List;

public class Calculat {
    public double sum(List<? extends Number> numbers){
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
