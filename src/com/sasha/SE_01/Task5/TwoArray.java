package com.sasha.SE_01.Task5;

//import java.util.Arrays;

/**
 * Created by Александра on 02.10.2016.
 */
public class TwoArray {
    private static void scalarMatrix(int size){
        int[][] matrix = new int[size][size];
        for(int i=0; i<size; i++){
            matrix[i][i]=1;
            matrix[i][size-1-i]=1;
            for(int j=0; j<size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            //String intArrayString = Arrays.toString(matrix[i]);
            //System.out.println(intArrayString);
        }
    }

    public static void main(String[] args) {
        scalarMatrix(6);
    }
}
