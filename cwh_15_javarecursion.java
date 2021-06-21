package com.company;

public class cwh_15_javarecursion {
    final public   static void main(String arr[]) {
        char c1 = 0xbeef;
        int j = 5;
        for (int i = 0; i<j;i++){
            if (i<=j--){
                System.out.println((i*j) + " ");
            }
        }
        int a= 3*4;
        int b = 3 << 2;
        System.out.println(a);
        System.out.println(b);
        double d = 100.04;
        //float f = d;
        int[] a2rr={};
        System.out.println(a2rr.length);


    }
    // sum of n numbers;
    int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
// printing first sum of odd no;
    int sum1(int a){
            if (a % 2 == 0) {
                a = a - 1;
            }
            if (a == 1) {
                return 1;
            }
            System.out.println(a);
            return a + sum1(a - 2);
    }
}
