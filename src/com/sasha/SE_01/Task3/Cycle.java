package com.sasha.SE_01.Task3;

/**
 * Created by Александра on 02.10.2016.
 */
public class Cycle {
    private static void functionF (double a, double b, double h) {
        double Fx;
        System.out.println("[" + a + ", " + b + "], h = " + h);
        System.out.println("x   |   F(x)");
        System.out.println("---------------------");
        for(double left=a; left<=b; left+=h){
            Fx = Math.tan(2*left)-3;
            System.out.println(left + " |   " + Fx);
        }
    }

    public static void main(String[] args) {
        functionF(0, 5, 0.5);
    }
}
