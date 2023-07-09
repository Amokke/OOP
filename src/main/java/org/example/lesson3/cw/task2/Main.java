package org.example.lesson3.cw.task2;

public class Main {
    public static void main(String[] args) {
        Fructs fructs = Fructs.valueOf("BANAN");
        System.out.println("fructs = " + fructs);
        switch (fructs){
            case APPLE, BANAN, ORANGE -> System.out.println("Это фрукт " + fructs.name);
            default -> System.out.println("Неопознанный фрукт");
        }
    }
}
