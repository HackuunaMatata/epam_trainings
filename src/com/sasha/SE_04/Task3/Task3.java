package com.sasha.SE_04.Task3;

import java.io.File;

/**
 * Created by Александра on 05.11.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        File inputFile = new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task3\\input.txt");
        File outputFile = new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task3\\output.txt");
        FromUtf8ToUtf16 need = new FromUtf8ToUtf16(inputFile, outputFile);

        need.readFile();
        need.writeFile();
        need.printFile();
    }
}
