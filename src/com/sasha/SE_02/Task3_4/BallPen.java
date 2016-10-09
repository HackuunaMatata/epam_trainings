package com.sasha.SE_02.Task3_4;

/**
 * Created by Александра on 09.10.2016.
 */
public class BallPen extends Pen {
    double diameter;

    public BallPen(String name, int cost, String colour, double diameter) {
        super(name, cost, colour);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return super.toString() + "  diameter: " + diameter;
    }
}
