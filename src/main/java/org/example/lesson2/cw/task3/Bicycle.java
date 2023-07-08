package org.example.lesson2.cw.task3;

public class Bicycle implements Transport{

    @Override
    public void start() {
        System.out.println("Велосипед поехал");
    }
    @Override
    public void stop() {
        System.out.println("Велосипед остановился");
    }
}
