package org.example.lesson5.cw.task1.service;


import org.example.lesson5.cw.task1.data.Student;

import java.util.List;

public interface DataService {
    void create(List<Student> studentList);
    List<Student> read();
}
