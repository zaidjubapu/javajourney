package com.company;

abstract class  parent2{
     parent2(){
        System.out.println("Mai base 2 ka constructor hoon");
    }
     void sayHello(){
        System.out.println("say hello");
    }
    abstract protected void greet();
    abstract public void greet2();
}


class child2 extends parent2{
    @Override // if we extend an abstract class then the method which we declared in abstract class with name absract
    // should be overriden or implement in subclass else it will throw an error
    //
    protected void greet(){
        System.out.println("good morning");
    }

    @Override
    public void greet2() {
        System.out.println("this is greet 2");
    }
}

public class cwh_25_Abstractclasses_Methods {
    public static void main(String[] args) {
        //child2 c = new child2();
        //c.sayHello();
        parent2 p = new child2(); // note it is possible to create a refrence of abstract class but not an object
        //parent2 pp = new parent2(); // we cant create on abstract class objectl
        p.sayHello();
        p.greet();
    }
}
