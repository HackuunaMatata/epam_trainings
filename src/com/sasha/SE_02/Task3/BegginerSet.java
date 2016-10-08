package com.sasha.SE_02.Task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александра on 09.10.2016.
 */
public class BegginerSet {

    public static void main(String[] args) {
        List<OfficeSupplies> begginerSet = new ArrayList<>();
        begginerSet.add(new BallPen("BallPen", 15, "red", 0.2));
        begginerSet.add(new CapillaryPen("CapillaryPen", 45, "blue", 5));
        begginerSet.add(new Notepad("Notepad", 125, 40));
        begginerSet.add(new Pencil("Pencil", 10, "HB"));


        System.out.println(begginerSet.toString());
    }



}
