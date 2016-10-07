package com.sasha.SE_02.Task2;

/**
 * Created by Александра on 08.10.2016.
 */
public class OfficeSupplies {
    private String name;
    private int cost;
    private int number;

    public OfficeSupplies(String name, int cost, int number) {
        this.name = name;
        this.cost = cost;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumber() {
        return number;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
