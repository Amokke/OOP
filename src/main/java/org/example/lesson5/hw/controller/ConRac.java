package org.example.lesson6.hw.controller;

import org.example.lesson6.hw.data.Rational;
import org.example.lesson6.hw.log.Log;
import org.example.lesson6.hw.service.CalcRat;


import java.util.Scanner;

public class ConRac {

    private static Rational createRacial() {
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        int tmp2 = 1;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите числитель: ");
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n1 = scanner.nextInt();
                    if (n1 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp = n;
                    flag1 = false;
                }
            }
            while (flag2) {
                System.out.println("Введите знаменатель: ");
                int n1 = scanner.nextInt();
                if (n1 <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp2 = n1;
                    flag = false;
                    flag2 = false;
                }
            }

        }
        return new Rational(tmp, tmp2);
    }
    public static void doingRac(Log log) {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Ввод первого число: ");
            Rational rational1 = createRacial();
            log.addLog(String.format("Введено первое число = %s", rational1));
            while (flag2) {
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
            Rational rational2 = createRacial();
            log.addLog(String.format("Введено второе число = %s", rational2));
            CalcRat calculate = new CalcRat();
            switch (doing.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", rational1, rational2, calculate.sum(rational1, rational2));
                    log.addLog(String.format("%s + %s = %s" + "\n", rational1, rational2, calculate.sum(rational1, rational2)));
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", rational1, rational2, calculate.sub(rational1, rational2));
                    log.addLog(String.format("%s - %s = %s" + "\n", rational1, rational2, calculate.sub(rational1, rational2)));
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", rational1, rational2, calculate.multi(rational1, rational2));
                    log.addLog(String.format("%s * %s = %s" + "\n", rational1, rational2, calculate.multi(rational1, rational2)));
                }
                case ('/') -> {
                    System.out.printf("%s : %s = %s" + "\n", rational1, rational2, calculate.div(rational1, rational2));
                    log.addLog(String.format("%s : %s = %s" + "\n", rational1, rational2, calculate.div(rational1, rational2)));
                }
            }
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Выход");
                flag = false;
            }
        }

    }
}
