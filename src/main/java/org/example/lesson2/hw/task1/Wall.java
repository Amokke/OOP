package org.example.lesson2.hw.task1;

public class Wall implements Stage {
    private String name;
    private int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public int getLength() {
        return height;
    }

    @Override
    public boolean stageRun(int jumpHeight) {
        if (height > jumpHeight) {
            System.out.println(name + " не перепрыгнул");
            return false;
        } else {
            System.out.println(name + " перепрыгнул");
            return true;
        }
    }
}
