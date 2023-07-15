package org.example.lesson5.cw.task1.data;

import java.time.LocalDate;

public class Teacher extends User{
    int teacherID;

    public Teacher(String name, LocalDate birthDate, int teacherID) {
        super(name, birthDate);
        this.teacherID = teacherID;
    }
}
