package org.example.lesson1.cw.task2;

public class Main {
    public static void main(String[] args) {
        CreditAccaunt credit = new CreditAccaunt("Иванов Иван", 123451, 1000, 10.0);
        SafeAccaunt safe = new SafeAccaunt("Иванов Иван", 2134565, 3000, 10);

        System.out.println(credit.getBalance());
        credit.calculateInterest();
        System.out.println(credit.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());

    }
}
