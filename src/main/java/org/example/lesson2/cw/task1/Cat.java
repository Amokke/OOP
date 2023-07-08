package org.example.lesson2.cw.task1;


public class Cat extends Animal{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    public Cat(String name) {
        super(name);
    }



    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    private String color;
    private Integer age;

    @Override
    public void voice() {
        System.out.println("myauy");
    }
    public void  animalInfo(){
        System.out.println("Это кот с именем " + name + ", с возрастом-" + age + ", с цветом шерсти: " + color);
    }

    public void klubok(){
        System.out.println(name + "свернулся клубком");
    }
}
