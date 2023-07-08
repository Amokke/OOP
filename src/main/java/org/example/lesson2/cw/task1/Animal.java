package org.example.lesson2.cw.task1;

public abstract class Animal{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void  animalInfo(){
        System.out.println("Животное :" + name);
    }
    public  abstract void  voice();
    public  void  jump(){
        System.out.println("Животное :" + name + " - подпрыгнуло");
    }
}
