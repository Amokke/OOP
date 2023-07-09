package org.example.lesson2.hw.task1;

public class Runningtrack implements Stage{
private String name;
    private int length;

    public Runningtrack(String name, int length) {
        this.name = name;
        this.length = length;
    }


    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean stageRun(int runDistance) {
        if (length > runDistance) {
            System.out.println(name + " не пробежал");
            return false;
        } else {
            System.out.println(name + " пробежал");
            return true;
        }
    }
}
