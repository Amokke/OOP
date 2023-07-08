package org.example.lesson2.cw.task1;

public class Main {
    public static void main(String[] args) {
        Animal[] catAndDogs = {
                new Cat("qwe", "asd", 21),
                new Dog("bobik", "black", 31)
        };
        for (Animal o : catAndDogs) {
           if (o instanceof Cat){
               ((Cat) o).klubok();
           } else {
               System.out.println("Не кот");
           }
            o.voice();
        }
    }
}
