package com.sasha.SE_02.Task1;

/**
 * Created by Александра on 05.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Pen one = new Pen();
        Pen two = new Pen("ballpoin", "green", "INC");
        Pen three = new Pen("ballpoin", "green", "INC");
        Pen four = new Pen();

        System.out.println("toString:");

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());


        System.out.println("-----------------------");
        System.out.println("equals:");

        System.out.println(one.equals(two));
        System.out.println(one.equals(four));
        System.out.println(two.equals(three));
        System.out.println(three.equals(null));

        System.out.println("-----------------------");
        System.out.println("hashCode:");

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(three.hashCode());
        System.out.println(four.hashCode());

    }
}
