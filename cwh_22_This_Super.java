package com.company;

class ekclass{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    ekclass(int v){
        this.a=v;
    }
    public int returnone(){
        return 1;
    }
}

public class cwh_22_This_Super {
    public static void main(String[] args) {

        ekclass e = new ekclass(4);
        //e.setA(10);
        System.out.println(e.getA());
    }
}
