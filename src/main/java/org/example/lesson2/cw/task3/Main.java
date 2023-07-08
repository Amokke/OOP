package org.example.lesson2.cw.task3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        human.drive(car);
        human.stop();
        Bicycle bicycle = new Bicycle();
        human.drive(bicycle);
        human.stop();
    }
}
