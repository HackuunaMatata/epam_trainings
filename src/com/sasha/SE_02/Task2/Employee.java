package com.sasha.SE_02.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александра on 08.10.2016.
 */
public class Employee {
    private String name;
    private List<OfficeSupplies> officeSet;

    public Employee(String name) {
        this.name = name;
        officeSet = new ArrayList<>();
    }

    public int fullCost() {
        int fullCost = 0;
        for (OfficeSupplies supply : officeSet) {
            fullCost += supply.getCost() * supply.getNumber();
        }
        return fullCost;
    }

    public void addSupply(String name, int cost, int number) {
        for (OfficeSupplies supply : officeSet) {
            if (name.equals(supply.getName())) {
                supply.setNumber(supply.getNumber() + number);
                supply.setCost(cost);
                return;
            }
        }
        officeSet.add(new OfficeSupplies(name, cost, number));
    }

    public String toString() {
        StringBuilder list = new StringBuilder("");
        for (OfficeSupplies supply : officeSet) {
            list.append(supply.getName() + "    Cost is " + supply.getCost() + "    Number is " + supply.getNumber() + "\n");
        }
        return ("Name: " + name + "     Supplies: \n" + list);
    }
}
