package com.company;

class A{
    public int harry(){
        return 4;
    }
    public void math2(){
        System.out.println("iam a method 2 of class A");
    }
}
class B extends A {
    public void math3() {
        System.out.println("iam a method 3 of class B");
    }

    public void math2() {
        System.out.println("iam a method 2 of class B");

    }
}

public class cwh_23_MethodOverriding {

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.math2();
    }
}
