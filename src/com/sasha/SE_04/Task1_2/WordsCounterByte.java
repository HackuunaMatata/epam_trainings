package com.sasha.SE_04.Task1_2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Александра on 23.10.2016.
 */
public class WordsCounterByte {
    Map<String, Integer> findWords = new HashMap<>();

    public WordsCounterByte(String path) {
        fillingMap();
        numberOfUsing(path);
    }

    private void fillingMap() {
        File file = new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task1_2\\javaWords.txt");
        try (InputStream inputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            int intRead;
            String word = "";
            while ((intRead = bufferedInputStream.read()) != -1) {
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
        try (InputStream inputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            int intRead;
            String word = "";
            while ((intRead = bufferedInputStream.read()) != -1) {
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

    public void printToFileWithStream(File output) {
        try (OutputStream outputStream = new FileOutputStream(output);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {

            for (String s : findWords.keySet()) {
                if (findWords.get(s) != 0) {
                    String record = s + " = " + findWords.get(s) + "\n";
                    byte[] buffer = record.getBytes();
                    bufferedOutputStream.write(buffer, 0, buffer.length);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
