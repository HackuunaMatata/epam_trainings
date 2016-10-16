package com.sasha.SE_02.Task5;

import java.util.HashMap;

import static com.sasha.SE_02.Task5.Subject.*;

/**
 * Created by Александра on 14.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Student sasha = new Student("Sasha");
        Student nikita = new Student ("Nikita");

        Group math = Groups.newGroup(ALGEBRA);
        Group art = Groups.newGroup(ART);

        math.addStudentMark(nikita, 2);
        math.addStudentMark(nikita, 4);
        math.addStudentMark(sasha, 4);
        art.addStudentMark(sasha, 5);
        art.addStudentMark(nikita, 5);

        HashMap<Subject, Double> infoNikita = Groups.findStudentSubjects(nikita);
        HashMap<Subject, Double> infoSasha = Groups.findStudentSubjects(sasha);
        System.out.println("Nikita");
        Groups.printStudent(infoNikita);
        System.out.println("Sasha");
        Groups.printStudent(infoSasha);
    }
}
