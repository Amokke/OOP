package org.example.lesson2.cw.task3;

public class Skate implements Transport{
    @Override
    public void start() {
        System.out.println("Скейт поехал");
    }
    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
