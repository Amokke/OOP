package org.example.lesson1.cw.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "white", 21);
        System.out.println("Кот: " + cat1.getName() + ", "
                + cat1.getColor() + " цвета, имеет возраст: " + cat1.getAge() + " лет");
        Cat cat2 = new Cat("Murzik", "black", 14);
        System.out.println("Кот: " + cat2.getName() + ", "
                + cat2.getColor() + " цвета, имеет возраст: " + cat2.getAge() + " лет");
    }
}
