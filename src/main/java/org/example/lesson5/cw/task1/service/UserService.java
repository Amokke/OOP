package org.example.lesson5.cw.task1.service;

import org.example.lesson5.cw.task1.data.Student;

import java.util.List;

public class UserService implements DataService{
    List<Student> studentList;
    @Override
    public void create(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
