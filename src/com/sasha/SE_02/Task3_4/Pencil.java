package com.sasha.SE_02.Task3_4;

/**
 * Created by Александра on 09.10.2016.
 */
public class Pencil extends OfficeSupplies {
    String hardness;

    public Pencil(String name, int cost, String hardness) {
        super(name, cost);
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return super.toString() + "  hardness: " + hardness;
    }
}
