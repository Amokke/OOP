package org.example.lesson2.cw.task2;

public class DomasticCat extends Cat{
    static int count;

    public DomasticCat(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
