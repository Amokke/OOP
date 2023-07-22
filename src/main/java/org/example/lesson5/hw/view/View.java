package org.example.lesson5.hw.view;

import org.example.lesson5.hw.controller.ConCom;
import org.example.lesson5.hw.controller.ConRac;
import org.example.lesson5.hw.log.Log;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Log log = new Log();


        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Выберите действие:\s
                    1.Рациональные числа.
                    2.Комплексные числа.
                    3.Просмотр логов.
                    4.Выход.""");
            int n = scanner.nextInt();
            switch (n) {
                case (1) -> {
                    ConRac.doingRac(log);
                    log.addLog("Выбран режим рациональных чисел");
                }
                case (2) -> {
                    ConCom.doingComplex(log);
                    log.addLog("Выбран режим рациональных чисел");
                }
                case (3) -> log.getLog();
                default -> {
                    System.out.println("Выходим из программы");
                    flag = false;
                }
            }
        }
        System.out.println("log = " + log);

    }
}
