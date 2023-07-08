package org.example.lesson2.cw.task2;

public class Cat extends Animal{
    static int count;
    int runDistance;

    public Cat(String name, int runDistance) {
        super(name);
        if (runDistance > 200) {
            this.runDistance = 200;
            System.out.println("Ввод некорректен, установлено максимальное значение");
        } else this.runDistance = runDistance;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println(super.name + " Не сможет пробежать");
        } else {
            System.out.println(super.name + " Пробежит");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(super.name + " Не умеет плавать");
    }
}
