package com.sasha.SE_02.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Александра on 16.10.2016.
 */
public class Groups {
    private static List<Group<? extends Number>> groups = new ArrayList<>();

    public static Group newGroup(Subject subject) {
        if (subject.isInteger()) {
            Group<Integer> group = new Group<>(subject);
            groups.add(group);
            return group;
        }
        Group<Double> group = new Group<>(subject);
        groups.add(group);
        return group;
    }

    public static HashMap<Subject, Double> findStudentSubjects(Student student) {
        HashMap<Subject, Double> subjectsMarks = new HashMap<>();
        double mark;
        for (Group group : groups) {
            mark = 0.0D;
            ArrayList<Number> marks = group.getValue(student);
            for (Number simpleMark : marks) {
                mark += (double) simpleMark.intValue();
            }
            mark /= marks.size();
            subjectsMarks.put(group.subject, mark);
        }
        return subjectsMarks;
    }

    public static void printStudent(HashMap<Subject, Double> subjects) {
        subjects.forEach((subject, mark) -> {
            System.out.println(subject + ": " + mark);
        });
    }

}