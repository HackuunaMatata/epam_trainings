package com.sasha.SE_07.Task1_2;

import com.sasha.SE_07.Task1_1.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Created by Александра on 13.11.2016.
 */
public class Transaction implements Callable<String> {
    public static List<Account> accounts = new ArrayList<>();
    private String line;
    private Account accountFrom = null;
    private Account accountTo = null;


    public Transaction(String line) {
        this.line = line;
    }



    @Override
    public String call() throws Exception {
        try (Scanner scanner = new Scanner(line)) {
            System.out.println(line);
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int amount = scanner.nextInt();

            for (Account account : accounts) {
                if (from == account.getId()) accountFrom = account;
                if (to == account.getId()) accountTo = account;
            }

            if (accountFrom == null || accountTo == null) {
                return "Account doesn't exist";
            }

            if (accountFrom.getBalance().get() > amount) {
                accountFrom.writeOff(amount);
            } else {
                return "Not enough money in account " + accountFrom.getId();
            }

            accountTo.charging(amount);
        }
        return accountFrom + " " + accountTo;
    }
}
