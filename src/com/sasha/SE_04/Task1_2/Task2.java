package com.sasha.SE_04.Task1_2;

import java.io.File;

/**
 * Created by Александра on 01.11.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task1_2\\resultSymbol.txt");
        WordsCounterSymbol need = new WordsCounterSymbol("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task1_2\\javaFile.txt");
        need.printToFileWithWriter(file);
    }


}
