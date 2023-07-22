package org.example.lesson7.controller.rational;


import org.example.lesson7.controller.Controller;
import org.example.lesson7.log.Log;
import org.example.lesson7.service.Calculate;

import java.util.Scanner;

public class DoingRat {
    public static void doingRac(Log log, String type) {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Ввод первого число: ");
            Object rational1 = Controller.constructor(type, log);
            log.addLog(String.format("Введено первое число = %s", rational1));
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                log.addLog(String.format("Выбрано действие = %s", doing1));
                if (!str.contains(doing1)) {
                    System.out.println("Вы ввели неверное значение" + "\n" + "Повторить ввод?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Выходим!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    doing = doing1;
                }
            }
            if (!flag) break;
            System.out.println("Ввод второго числа: ");
            Object rational2 = Controller.constructor(type, log);
            log.addLog(String.format("Введено второе число = %s", rational2));
            Calculate.calcResult(type, rational1, rational2, doing, log);
            doing = null;
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Выход");
                flag = false;
            }
        }

    }
}
