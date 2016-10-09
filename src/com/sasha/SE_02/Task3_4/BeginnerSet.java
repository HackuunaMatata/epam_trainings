package com.sasha.SE_02.Task3_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Александра on 09.10.2016.
 */
public class BeginnerSet {
    static List<OfficeSupplies> beginnerSet = new ArrayList<>();

    public static void main(String[] args) {
        beginnerSet.add(new BallPen("BallPen", 17, "red", 0.2));
        beginnerSet.add(new BallPen("BallPen", 15, "black", 0.3));
        beginnerSet.add(new CapillaryPen("CapillaryPen", 45, "blue", 5));
        beginnerSet.add(new Notepad("Notepad", 125, 40));
        beginnerSet.add(new Pencil("Pencil", 10, "HB"));

        System.out.println(beginnerSet);

        System.out.println("Sorted by name:");
        sortedByName();
        System.out.println(beginnerSet);

        System.out.println("Sorted by cost:");
        sortedByCost();
        System.out.println(beginnerSet);

        System.out.println("Sorted by name and cost:");
        sortedByNameAndCost();
        System.out.println(beginnerSet);
    }

    public static void sortedByCost() {
        Collections.sort(beginnerSet, new ByCostComparator());
    }

    public static void sortedByName() {
        Collections.sort(beginnerSet, new ByNameComparator());
    }

    public static void sortedByNameAndCost() {
        Collections.sort(beginnerSet, new ByCostComparator());
        Collections.sort(beginnerSet, new ByNameComparator());
    }

}
