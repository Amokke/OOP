package org.example.lesson5.cw.task1.data;

import java.time.LocalDate;

public class Student extends User{
    int studentID;

    public Student(String name, LocalDate birthDate, int studentID) {
        super(name, birthDate);
        this.studentID = studentID;
    }
}
