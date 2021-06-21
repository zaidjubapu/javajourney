package com.company;

public class cwh_13_psarray {
    // q1: create an array of 5 floats and calculate thier sum
    /*public static void main(String[] args) {
        float[] arr = {1.5f,2.5f,5.4f,6.5f,7.888f};
        float sum=0.f;
        for (float x : arr){
            sum += x;
        }
        System.out.print(sum);
    }*/
    int a=4;
    public static void main(String[] args) {
        // q2: create a java program to add two matrice of size 2X3
        //System.out.println(int a=5;);
        float[][] arr;
        float sum = 0;
        arr = new float[][]{{1, 2, 3}, {2, 3, 4,}};
        //System.out.println(arr[1][3]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                sum += arr[i][j];
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("total sum is : " + sum);

    }
}
