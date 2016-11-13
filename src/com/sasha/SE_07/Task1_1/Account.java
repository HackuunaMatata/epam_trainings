package com.sasha.SE_07.Task1_1;

/**
 * Created by Александра on 07.11.2016.
 */
public class Account {
    private int id;
    private int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public void charging(int amount) {
        this.balance += amount;
    }

    public void writeOff(int amount) {
        this.balance -= amount;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
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
