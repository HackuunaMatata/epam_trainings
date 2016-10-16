package com.sasha.SE_02.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Александра on 13.10.2016.
 */
public class Group<Mark extends Number> {
    public Map<Student, ArrayList<Mark>> list = new HashMap<>();
    public Subject subject;

    public Group(Subject subject) {
        this.subject = subject;
    }

    public void addStudentMark(Student student, Mark mark) {
        ArrayList<Mark> marks = list.get(student);
        if (marks == null) {
            list.put(student, new ArrayList<>());
        }
        list.get(student).add(mark);
    }

    public ArrayList<Mark> getValue(Student student) {
        return list.get(student);
    }

}
