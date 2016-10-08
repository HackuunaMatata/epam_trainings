package com.sasha.SE_02.Task3;

/**
 * Created by Александра on 09.10.2016.
 */
public class CapillaryPen extends Pen {
    int lengthOfLife;

    public CapillaryPen(String name, int cost, String colour, int lengthOfLife) {
        super(name, cost, colour);
        this.lengthOfLife = lengthOfLife;
    }

    @Override
    public String toString() {
        return super.toString() + "  lengthOfLife: " + lengthOfLife;
    }
}
