package org.example.lesson7.controller.rational;

import org.example.lesson7.data.Rational;

import java.util.Scanner;

public class CreateRat {
    public static Rational createRacial() {
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
}
