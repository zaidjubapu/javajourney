package com.company;

class Base1{
    Base1(){
        System.out.println("mai Base class ka constructor hoon");
    }
    Base1(int x){
        System.out.println("mai Base class ka overloaded constructor hoon aur x ki value leta hoon " + x);
    }
}

class Derived1 extends Base1{
    /*Derived1(){
        //super(2); // super keyword is used to call the super class constructor , if the constructor is taking any argument
        System.out.println("iam the constructor of derived class");
    }*/
    Derived1(int x,int y){
        super(x);
        System.out.println("iam the overloaded constructor of derived class taking parameters x and y as " + x +" "+ y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){ // we cant create this constructor without using the super keyword,because
        // as the derived 1 class dont have an default constructor. so we need to pass
        // the parameter by using the keyword super
        super(1,2);
        System.out.println("iam a child of derived constructor");
    }

}

public class cwh_21_Constructors_in_inheritance {

    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(4,9);
        ChildOfDerived c = new ChildOfDerived();
    }
}
