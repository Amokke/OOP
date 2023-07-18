package org.example.lesson5.hw.controller;

import org.example.lesson5.hw.data.Complex;
import org.example.lesson5.hw.data.Rational;
import org.example.lesson5.hw.service.DataService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    protected List<String> log = new ArrayList<>();


    public void start() {
        Scanner scanner = new Scanner(System.in);

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
                    log.add("Выбран режим рациональных чисел");
                    doingRac();
                }
                case (2) -> {
                    log.add("Выбран режим комплексных чисел");
                    doingComplex();
                }
                case (3) -> {
                    for (String s : log) {
                        System.out.println(s);
                    }
                }
                default -> {
                    System.out.println("Выходим из программы");
                    flag = false;
                }
            }
        }
    }

    private void doingRac() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Ввод первого число: ");
            Rational rational1 = createRacial();
            log.add(String.format("Введено первое число = %s", rational1));
            while (flag2) {
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                log.add(String.format("Выбрано действие = %s", doing1));
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
            log.add(String.format("Введено второе число = %s", rational2));
            DataService calculate = new DataService();
            switch (doing.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", rational1, rational2, calculate.sum(rational1, rational2));
                    log.add(String.format("%s + %s = %s" + "\n", rational1, rational2, calculate.sum(rational1, rational2)));
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", rational1, rational2, calculate.sub(rational1, rational2));
                    log.add(String.format("%s - %s = %s" + "\n", rational1, rational2, calculate.sub(rational1, rational2)));
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", rational1, rational2, calculate.multi(rational1, rational2));
                    log.add(String.format("%s * %s = %s" + "\n", rational1, rational2, calculate.multi(rational1, rational2)));
                }
                case ('/') -> {
                    System.out.printf("%s : %s = %s" + "\n", rational1, rational2, calculate.div(rational1, rational2));
                    log.add(String.format("%s : %s = %s" + "\n", rational1, rational2, calculate.div(rational1, rational2)));
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

    private void doingComplex() {
        Scanner scanner = new Scanner(System.in);
        String str = "+, -, *, /";
        String doing = "";
        boolean flag = true;
        while (flag) {
            boolean flag2 = true;
            System.out.println("Давайте введем первое число: ");
            Complex number1 = creatComplex();
            log.add(String.format("Введено первое число = %s", number1));
            while (flag2) {
                scanner.nextLine();
                System.out.println("Выберете действие(+, -, *, /): ");
                String doing1 = scanner.nextLine();
                log.add(String.format("Выбрано действие = %s", doing1));
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
            log.add(String.format("Введено второе число = %s", number2));
            DataService dataService = new DataService();
            switch (doing.charAt(0)) {
                case ('+') -> {
                    System.out.printf("%s + %s = %s" + "\n", number1, number2, dataService.sum(number1, number2));
                    log.add(String.format("%s + %s = %s" + "\n", number1, number2, dataService.sum(number1, number2)));
                }
                case ('-') -> {
                    System.out.printf("%s - %s = %s" + "\n", number1, number2, dataService.sub(number1, number2));
                    log.add(String.format("%s - %s = %s" + "\n", number1, number2, dataService.sub(number1, number2)));
                }
                case ('*') -> {
                    System.out.printf("%s * %s = %s" + "\n", number1, number2, dataService.multi(number1, number2));
                    log.add(String.format("%s * %s = %s" + "\n", number1, number2, dataService.multi(number1, number2)));
                }
                case ('/') -> {
                    System.out.printf("%s : %s = %s" + "\n", number1, number2, dataService.div(number1, number2));
                    log.add(String.format("%s : %s = %s" + "\n", number1, number2, dataService.div(number1, number2)));
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


    private Rational createRacial() {
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

    private Complex creatComplex() {
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
}