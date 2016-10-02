package com.sasha.SE_01.Task4;


/**
 * Created by Александра on 02.10.2016.
 */
public class OneArray {
    private static void maxElement(double[] arr) {
        int n = arr.length;
        double[] combinedArray = new double[2 * n];
        double max = combinedArray[0] + combinedArray[2 * n - 1];
        System.arraycopy(arr, 0, combinedArray, 0, n);
        System.arraycopy(arr, 0, combinedArray, n, n);
        for (int i = 0; i < n; i++) {
            double newElement = combinedArray[i] + combinedArray[2 * n - 1 - i];
            System.out.println(newElement);
            if (newElement > max) {
                max = newElement;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        double[] arr = {-0.3, 5, 0.789, -0.67894, -46.46, 1.549, 0};
        maxElement(arr);
    }
}
