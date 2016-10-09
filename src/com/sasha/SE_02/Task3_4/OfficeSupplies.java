package com.sasha.SE_02.Task3_4;

/**
 * Created by Александра on 09.10.2016.
 */
public class OfficeSupplies {
    String name;
    int cost;

    public OfficeSupplies(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\nname: " + name + "  cost: " + cost;
    }
}
