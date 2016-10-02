package com.sasha.SE_01.Task2;

/**
 * Created by Александра on 02.10.2016.
 */
public class Number {
    private static void findMinElement(int n, double e) {
        int number = n+1;
        double[] arr = new double[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = 1 / (Math.pow(i + 1, 2));
            if ((i - 1) < number && arr[i - 1] < e) {
                number = i - 1;
            }
        }
        /*for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }*/
        if (number == (n+1)) {
            System.out.println("Too small e");
        } else {
            System.out.println("min number =" + (number + 1));
            for (int i = 0; i <= number; i++) {
                System.out.println("a[" + (i + 1) + "] = " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        findMinElement(10, 0.1);
    }

}
