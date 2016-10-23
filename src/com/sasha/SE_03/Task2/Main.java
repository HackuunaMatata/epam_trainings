package com.sasha.SE_03.Task2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Александра on 23.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder numQuestion = new StringBuilder("question");
        StringBuilder numAnswer = new StringBuilder("answer");
        int number;
        ResourceQuestion question;
        ResourceAnswer answer;

        System.out.println("(1)EN or (2)RU?");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        if (number == 1) {
            question = new ResourceQuestion(new Locale("en", "US"));
            answer = new ResourceAnswer(new Locale("en", "US"));
        } else {
            question = new ResourceQuestion(new Locale("ru", "RU"));
            answer = new ResourceAnswer(new Locale("ru", "RU"));
        }
        for (int i = 1; i < 4; i++) {
            numQuestion.append(i);
            System.out.println(question.getValue(numQuestion.toString()));
            numQuestion.deleteCharAt(8);
        }
        number = in.nextInt();
        numAnswer.append(number);
        System.out.println(answer.getValue(numAnswer.toString()));
    }
}
