package com.sasha.SE_02.Task3;

/**
 * Created by Александра on 09.10.2016.
 */
public class Notepad extends OfficeSupplies {
    int listNumber;

    public Notepad(String name, int cost, int listNumber) {
        super(name, cost);
        this.listNumber = listNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "  listNumber: " + listNumber;
    }
}
