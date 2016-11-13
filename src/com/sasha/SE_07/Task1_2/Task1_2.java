package com.sasha.SE_07.Task1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Александра on 13.11.2016.
 */
public class Task1_2 {
    public static void main(String[] args) {
        Transaction.accounts.add(new Account(1, 5000));
        Transaction.accounts.add(new Account(2, 4000));
        Transaction.accounts.add(new Account(3, 3000));
        Transaction.accounts.add(new Account(4, 2000));

        try (Scanner scanner = new Scanner(new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_07\\Task1_2\\transfer.txt"))) {
            ExecutorService es = Executors.newCachedThreadPool();
            while (scanner.hasNext()) {
                Future<String> thread = es.submit(new Transaction(scanner.nextLine()));
                System.out.println(thread.get());
            }
        } catch (FileNotFoundException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
