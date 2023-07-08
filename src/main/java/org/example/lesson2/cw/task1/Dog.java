package org.example.lesson2.cw.task1;

public class Dog extends Animal{
    private String color;
    private int age;


    public Dog(String name, String color, int age) {
        super(name);
        this.age = age;
        this.color = color;
    }

    public Dog(String name) {
        super(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice(){
        System.out.println("gav - gav");
    }
}
