package com.company;

public class Main {
    byte a = 1;
    short d = 5;
    int  i = 45;
    float f = 456.f;
    long l = 12;
    double s = 1234;
    char c = 'a';
    int x = 10;
    //static int d = ;
    static int y = 15;
    //static float z = (100.0f/3);
    void operation(){
        int e = a+d;
        long g = c +l;
        long t = i + l;
        float r = f + l;
        int z = (int)33.3f;
        int y = ++z *2 + ++z + --z*2;
        int[] arr = new int[3];
        float[] arr1 = new float[2];
        System.out.println(y);
        System.out.println(z++);

    }
    public static void hell(){
        //System.out.println("z = " + String.format("%.2f",z));
    }
    public void assign(int x){
        System.out.println(y);
        x=x;
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        //System.out.println(z);
        //hell();
        Main obj = new Main();
        obj.operation();

        /* write your code here */
        /*int $nam12e=12;
        System.out.println($nam12e);
        System.out.println(args);
        cwh_14_methodoverloading obj1 = new cwh_14_methodoverloading();
        int d = obj1.zaid;
        //System.out.println(args[1]);*/

        /*javarecursion obj1 = new javarecursion();
         // cant write the same object name cwh_14_methodoverloading obj1 = new cwh_14_methodoverloading();
        int a = obj1.sum(5);
        //System.out.println(" the total sum is " + a);
        int b = obj1.sum1(6);
        System.out.println("the sum of odd no is " + b);
        //int d = Integer.parseInt(null);
        int [] arr = new int[]{1,2,3};
        System.out.println(arr[1]);
        int _mhf = 2;
        //int arr1[][] = new int[2][3];
        int [][] e  = new int [1][1];
        e= new int[][]{{1, 2, 4},{1,2,3}};
        System.out.println(e[0][2]);
        a= arr.length;
    }
        cwh_16_oop obj1 = new cwh_16_oop();
        cwh_16_oop obj2 = new cwh_16_oop();
        obj1.zaid.id =3;
        obj2.zaid.id=15;
        obj2.zaid.printDetail();/*/

        /*new Main().assign(100);
        new Main();
        //s1.assign(100);*/

    }
}

