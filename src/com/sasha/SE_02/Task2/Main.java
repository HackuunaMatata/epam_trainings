package com.sasha.SE_02.Task2;

/**
 * Created by Александра on 08.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee("Nikita");
        person1.addSupply("Pen", 25, 2);
        person1.addSupply("Pen", 25, 2);
        person1.addSupply("Ruler", 10, 1);
        System.out.println(person1.toString());
        System.out.println("Full cost is " + person1.fullCost());

    }
}
