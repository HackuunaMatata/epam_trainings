package com.sasha.SE_05.Task1;

import java.util.Scanner;

/**
 * Created by Александра on 06.11.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        String text;
        boolean flag = true;
        try (Scanner in = new Scanner(System.in)) {
            while (flag) {
                System.out.println(WorkWithFile.getPath());
                System.out.println("Enter a command");
                switch (in.next()) {
                    case "setPath": {
                        System.out.println("Enter a path to file or catalog");
                        WorkWithFile.setPath(in.next());
                        break;
                    }
                    case "open": {
                        text = WorkWithFile.readFile();
                        System.out.println(text);
                        break;
                    }
                    case "write": {
                        System.out.println("Enter a text");
                        text = in.next();
                        WorkWithFile.writeToFile(text);
                        break;
                    }
                    case "clearAndWrite": {
                        System.out.println("Enter a text");
                        text = in.next();
                        WorkWithFile.clearAndWriteToFile(text);
                        break;
                    }
                    case "create": {
                        WorkWithFile.createFile();
                        break;
                    }
                    case "delete": {
                        WorkWithFile.deleteFile();
                        break;
                    }
                    case "catalog": {
                        text = WorkWithFile.catalog();
                        System.out.println(text);
                        break;
                    }
                    case "exit": {
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("Incorrect command");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
