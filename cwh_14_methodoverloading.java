package com.company;

public class cwh_14_methodoverloading {
    int zaid = 56;
    static void change1(int a){
        a=54;
    }

    static void change1(int[] arr1){
        arr1[0]=54;
    }


    int d = 30;
    public static void main(String[] args) {
        int b=56;
        int[] arr11={1,2,3,4,5};
        change1(b);
        change1(arr11);
        System.out.println("the a is 54 and b is 56 after change b is " + b  );
        System.out.println("the array has beed changeds as : " + arr11[0]); // therefor array is just a reefrence
    }
}
