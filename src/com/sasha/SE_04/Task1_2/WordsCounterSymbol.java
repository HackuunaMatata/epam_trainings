package com.sasha.SE_04.Task1_2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Александра on 23.10.2016.
 */
public class WordsCounterSymbol {
    Map<String, Integer> findWords = new HashMap<>();

    public WordsCounterSymbol(String path) {
        fillingMap();
        numberOfUsing(path);
    }

    private void fillingMap() {
        File file = new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task1_2\\javaWords.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedreader = new BufferedReader(fileReader)) {

            int intRead;
            String word = "";
            while ((intRead = bufferedreader.read()) != -1) {
                if (intRead != (int) '\r' && intRead != (int) '\n') {
                    word += (char) intRead;
                } else {
                    if (word.compareTo("") != 0) {
                        findWords.put(word, 0);
                    }
                    word = "";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void counterWords(String word) {
        if (findWords.get(word) != null) findWords.put(word, findWords.get(word) + 1);
        //findWords.keySet().stream().filter(s -> word.compareTo(s) == 0).forEach(s -> findWords.put(s, findWords.get(s) + 1));
    }

    private void numberOfUsing(String path) {
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedreader = new BufferedReader(fileReader)) {

            int intRead;
            String word = "";
            while ((intRead = bufferedreader.read()) != -1) {
                if ((char) intRead >= 'a' && (char) intRead <= 'z') {
                    word += (char) intRead;
                } else {
                    if (word.compareTo("") != 0) {
                        counterWords(word);
                    }
                    word = "";
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printToFileWithWriter(File output) {
        try (Writer writer = new FileWriter(output);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            for (String s : findWords.keySet()) {
                if (findWords.get(s) != 0) {
                    String record = s + " = " + findWords.get(s) + "\n";
                    bufferedWriter.write(record, 0, record.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
