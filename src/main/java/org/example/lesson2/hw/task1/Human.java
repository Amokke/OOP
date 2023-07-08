package org.example.lesson2.hw.task1;

public class Human implements Actions {

    private String name;
    private  int runDistance;
    private  int jumpHeight;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " пробежал " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println(this.name + " подпрыгнул на " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
