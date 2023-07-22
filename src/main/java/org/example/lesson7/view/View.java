package org.example.lesson7.view;


import org.example.lesson7.controller.Controller;
import org.example.lesson7.log.Log;

import java.util.Scanner;

public class View {
    public static void start() {

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
                    log.addLog("Выбран режим рациональных чисел");
                    Controller.doing(log, "Rational");
                }
                case (2) -> {
                    log.addLog("Выбран режим рациональных чисел");
                    Controller.doing(log, "Complex");
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
