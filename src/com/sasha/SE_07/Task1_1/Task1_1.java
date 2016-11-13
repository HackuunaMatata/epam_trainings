package com.sasha.SE_07.Task1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Александра on 07.11.2016.
 */
public class Task1_1 {
    public static void main(String[] args) {
        Transaction.accounts.add(new Account(1, 5000));
        Transaction.accounts.add(new Account(2, 4000));
        Transaction.accounts.add(new Account(3, 3000));
        Transaction.accounts.add(new Account(4, 2000));

        try (Scanner scanner = new Scanner(new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_07\\Task1_1\\transfer.txt"))) {
            while (scanner.hasNext()) {
                Thread thread = new Thread(new Transaction(scanner.nextLine()));
                thread.start();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
