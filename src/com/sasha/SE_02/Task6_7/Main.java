package com.sasha.SE_02.Task6_7;

/**
 * Created by Александра on 16.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        NuclearSubmarine sub1 = new NuclearSubmarine();
        NuclearSubmarine sub2 = new NuclearSubmarine("Karasik");

        sub1.startSwim();
        sub1.stopSwim();

        System.out.println();

        sub2.startSwim();
        sub2.stopSwim();
    }
}
