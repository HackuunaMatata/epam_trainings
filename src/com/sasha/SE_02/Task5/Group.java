package com.sasha.SE_02.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Александра on 13.10.2016.
 */
public class Group<Mark> {
    private static List<Group> groups = new ArrayList<>();
    public Map<String, ArrayList<Mark>> list = new HashMap<>();
    public Subject subject;

    public Group(Subject subject) {
        this.subject = subject;
        groups.add(this);
    }

    public Group newGroup(Subject subject) {
        if (subject.isInteger()) {
            Group<Integer> group = new Group<>(subject);
            return group;
        }
        Group<Double> group = new Group<>(subject);
        return group;
    }

    public void addStudentMark(Student student, Mark mark) {
        ArrayList<Mark> marks = list.get(student.getName());
        if (marks == null) {
            list.put(student.getName(), new ArrayList<Mark>());
        }
        list.get(student.getName()).add(mark);
    }

    public static HashMap<Subject, Double> findStudentSubjects(Student student) {
        HashMap<Subject, Double> subjectsMarks = new HashMap<>();
        for (Group group : groups) {
            Object o = group.list.get(student.getName());
        }
        return subjectsMarks;
    }


}
