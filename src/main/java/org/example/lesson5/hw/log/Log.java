package org.example.lesson5.hw.log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Log {
    protected List<String> log = new ArrayList<>();


    public void getLog() {
        List<List<String>> listHistory = Arrays.asList(log);
        for (List<String> stringList : listHistory) {
            System.out.println(stringList);
        }
    }

    public void addLog(String a) {
        log.add(a);
    }
}
