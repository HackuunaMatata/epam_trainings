package com.sasha.SE_02.Task3_4;

/**
 * Created by Александра on 09.10.2016.
 */
public class Pen extends OfficeSupplies {
    String colour;

    public Pen(String name, int cost, String colour) {
        super(name, cost);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + "  colour: " + colour;
    }
}
