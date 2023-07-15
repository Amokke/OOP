package org.example.lesson4.cw.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*BoxWithNumber<Integer> box1 = new BoxWithNumber(1, 2, 3, 4, 5, 9, 10, 15);
        System.out.println("box1.average() = " + box1.average());
        BoxWithNumber<Double> box2 = new BoxWithNumber(1.5, 2.0, 3.3, 4.4, 5.3, 9.7, 10.5, 15.8);
        System.out.println("box2.average() = " + box2.average());
        System.out.println("box1.compareAverage(box2) = " + box1.compareAverage(box2));

        Calculat calculat = new Calculat();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDoub = new ArrayList<>();
        List<Number> listNum = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listInt.add(i);
            listDoub.add((double) i);
            listNum.add(i);
        }
        System.out.println("calculat.sum(listNum) = " + calculat.sum(listInt));

        LRUCache<Employee> lruCache = new LRUCache<Employee>(4);
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee("Иванов Иван Иванович " + i, i * 100, "раб " + i));
        }
        for (Employee employee : employees) {
            lruCache.addElement(employee);
            System.out.println("lruCache.getAllElement() = " + lruCache.getAllElement());
        }
        */
        Calculat calculat = new Calculat();
        String str = "6.43";
        String str1 = "8.0";
        String str2 = "5";
        List<Double> arrDouble1 = new ArrayList<>(Arrays.asList(0.1, 2.3, 4.5));
        List<Integer> arrInteger = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println("calculat.multy(test1) = " + calculat.multi(arrDouble1));
        System.out.println("calculat.division(test2) = " + calculat.divis(arrInteger));
        System.out.println("calculat.translateBinary(str) = " + calculat.binary(str));
        System.out.println("calculat.translateBinary(str1) = " + calculat.binary(str1));
        System.out.println("calculat.translateBinary(str2) = " + calculat.binary(str2));
    }
}
