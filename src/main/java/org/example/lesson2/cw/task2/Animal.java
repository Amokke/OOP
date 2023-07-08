package org.example.lesson2.cw.task2;

public abstract class Animal {
    static  int count;
    String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }
    public abstract void run(int distance);
    public abstract void swim(int distance);
}
