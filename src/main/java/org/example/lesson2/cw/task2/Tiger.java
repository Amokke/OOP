package org.example.lesson2.cw.task2;


public class Tiger extends Cat {
    static  int count;

    public Tiger(String name, int runDistance) {
        super(name, runDistance);
        count++;
    }
}
