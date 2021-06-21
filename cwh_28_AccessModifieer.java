package com.company;

class c5{
    public int x = 5;
    protected int d = 5;
    int g = 4;
    private int z = 10;

    public void math5(){
        System.out.println(x);
        System.out.println(d);
        System.out.println(g);
        System.out.println(z);
    }

}

public class cwh_28_AccessModifieer {
    public static void main(String[] args) {
        c5 d = new c5();
        d.math5();
    }
}
