package com.sasha.SE_04.Task3;

import java.io.*;

/**
 * Created by Александра on 05.11.2016.
 */
public class FromUtf8ToUtf16 {
    private File input;
    private File output;
    private String text;

    public FromUtf8ToUtf16(File input, File output) {
        this.input = input;
        this.output = output;
    }

    public void readFile() {
        try (InputStream inputStream = new FileInputStream(input);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            int symbol;
            StringBuilder textInFile = new StringBuilder();

            while ((symbol = bufferedReader.read()) != -1) {
                textInFile.append((char) symbol);
            }
            text = textInFile.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try (OutputStream outputStream = new FileOutputStream(output);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            bufferedWriter.write(text, 0, text.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFile() {
        System.out.println(text);
    }
}