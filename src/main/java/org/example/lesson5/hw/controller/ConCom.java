package org.example.lesson6.hw.controller;

import org.example.lesson6.hw.data.Complex;
import org.example.lesson6.hw.log.Log;
import org.example.lesson6.hw.service.CalcCom;

import java.util.Scanner;

public class ConCom {


    public static Complex creatComplex() {
        Scanner scanner = new Scanner(System.in);
        double tmp = 1.0;
        double tmp2 = 1.0;
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        while (flag) {
            while (flag1) {
                System.out.println("Введите первое слагаемое(например - 3,5): ");
                double n = scanner.nextDouble();
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
                System.out.println("Введите второе слагаемое(например - 12,7): ");
                double n3 = scanner.nextDouble();
                if (n3 <= 0) {
                    System.out.println("Вы ввели некорректные данные" + "\n" + "Еще раз попробуете?(1 - да, 2 - нет)");
                    int n2 = scanner.nextInt();
                    if (n2 != 1) {
                        flag = false;
                        break;
                    }
                } else {
                    tmp2 = n3;
                    flag = false;
                    flag2 = false;
                }
            }

        }
        return new Complex(tmp, tmp2);
    }
    public static void doingComplex(Log log) {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Давайте введем первое число: ");
            Complex number1 = creatComplex();
            log.addLog(String.format("Введено первое число = %s", number1));
            while (flag2) {
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
            Complex number2 = creatComplex();
            log.addLog(String.format("Введено второе число = %s", number2));
            CalcCom calculate = new CalcCom();
            switch (doing.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", number1, number2, calculate.sum(number1, number2));
                    log.addLog(String.format("%s + %s = %s" + "\n", number1, number2, calculate.sum(number1, number2)));
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", number1, number2, calculate.sub(number1, number2));
                    log.addLog(String.format("%s - %s = %s" + "\n", number1, number2, calculate.sub(number1, number2)));
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", number1, number2, calculate.multi(number1, number2));
                    log.addLog(String.format("%s * %s = %s" + "\n", number1, number2, calculate.multi(number1, number2)));
                }
                case ('/') -> {
                    System.out.printf("%s : %s = %s" + "\n", number1, number2, calculate.div(number1, number2));
                    log.addLog(String.format("%s : %s = %s" + "\n", number1, number2, calculate.div(number1, number2)));
                }
            }
            System.out.println("Продолжим работу?(1 - да, 2 - нет)");
            int n3 = scanner.nextInt();
            if (n3 != 1) {
                System.out.println("Выход!");
                flag = false;
            }
        }

    }
}
