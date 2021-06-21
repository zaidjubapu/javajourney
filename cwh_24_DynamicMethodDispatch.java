package com.company;

class phone{
    public void on(){
        System.out.println("Turning on phone..");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
class Smartphone extends phone{
    public void three(){
        System.out.println("my name is three method");
    }

    public void on(){
        //super;
        System.out.println("Turning on the smartphone");
    }
}

public class cwh_24_DynamicMethodDispatch {
    public static void main(String[] args) {
        //phone t = new phone();
        //Smartphone obj = new Smartphone();
        //t.one();

        phone obj = new Smartphone(); // we can create the super class refrence and can create the object of subclass
        // but we cant create the refrence of subclass and an object for super class
        //Smartphone obj1 =  new phone(); // throwing error because smartphone is subclass
        //obj.three();// throw error because three methods is not there in phone
        obj.on();// if there is a same method name in both class then the method of object(child class will cal)

    }
}
