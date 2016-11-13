package com.sasha.SE_07.Task1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Александра on 07.11.2016.
 */
public class Transaction implements Runnable {
    public static List<Account> accounts = new ArrayList<>();
    private String line;
    private Account accountFrom = null;
    private Account accountTo = null;


    public Transaction(String line) {
        this.line = line;
    }

    @Override
    public void run() {
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
                System.out.println("Account doesn't exist");
                return;
            }

            synchronized (accountFrom) {
                if (accountFrom.getBalance() > amount) {
                    accountFrom.writeOff(amount);
                } else {
                    System.out.println("Not enough money in account " + accountFrom.getId());
                    return;
                }
            }

            synchronized (accountTo) {
                accountTo.charging(amount);
            }

            System.out.println(accountFrom + " " + accountTo);
        }


    }
}
