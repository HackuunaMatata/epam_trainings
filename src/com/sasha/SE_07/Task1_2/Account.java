package com.sasha.SE_07.Task1_2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Александра on 13.11.2016.
 */
public class Account {
    private int id;
    private AtomicInteger balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = new AtomicInteger(balance);
    }

    public void charging(int amount) {
        this.balance.addAndGet(amount);
    }

    public void writeOff(int amount) {
        this.balance.addAndGet(-1 * amount);
    }

    public int getId() {
        return id;
    }

    public AtomicInteger getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
