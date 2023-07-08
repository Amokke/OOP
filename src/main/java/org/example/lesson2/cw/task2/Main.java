package org.example.lesson2.cw.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new DomasticCat("Barsik", 20),
                new Tiger("Sharhan", 40),
                new Dog("Sharik",150,10),
                new Cat("Murzik",25)
        };
        for (Animal animal : animals) {
            animal.run(30);
            animal.swim(10);
        }
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Dog.count = " + Dog.count);
        System.out.println("Cat.count = " + Cat.count);
        System.out.println("DomasticCat.count = " + DomasticCat.count);
        System.out.println("Tiger.count = " + Tiger.count);
    }
}
