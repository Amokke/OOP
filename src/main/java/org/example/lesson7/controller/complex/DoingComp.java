package org.example.lesson7.controller.complex;

import org.example.lesson7.controller.Controller;
import org.example.lesson7.log.Log;
import org.example.lesson7.service.Calculate;

import java.util.Scanner;

public class DoingComp {
    public static void doingComplex(Log log, String type) {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Давайте введем первое число: ");
            Object number1 = Controller.constructor(type, log);
            log.addLog(String.format("Введено первое число = %s", number1));
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                log.addLog(String.format("Выбрано действие = %s", doing1));
                if (!str.contains(doing1)) {
                    System.out.println("Вы ввели неверное значение" + "\n" + "Еще раз попробуем?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        System.out.println("Выход!");
                        flag2 = false;
                        flag = false;
                    }
                } else {
                    flag2 = false;
                    doing = doing1;
                }
            }
            if (!flag) break;
            System.out.println("Давайте введем второе число: ");
            Object number2 = Controller.constructor(type, log);
            log.addLog(String.format("Введено второе число = %s", number2));
            Calculate.calcResult(type, number1, number2, doing, log);
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Выход!");
                flag = false;
            }
        }

    }
}
