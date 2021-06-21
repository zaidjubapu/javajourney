package com.company;

interface Bycycle{
    int a = 1;
    void applyBreak(int decrement);
    void speedUp(int increment);

}
interface hornbyccycl{
    public void blowhornsuper();
    public void blohahah();
}

class AvonCycle implements Bycycle,hornbyccycl{
    void blowhorn(){
        System.out.println("pee pee poo");
    }
    int speed = 7;
    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
        System.out.println("applying break");
    }

    @Override
    public void speedUp(int increment) {
    speed = speed + increment;
    System.out.println("Speeding up... with speed of " + speed + " KM/h");;
    }

    @Override
    public void blowhornsuper() {
        System.out.println("laowefoiqwoi");
    }

    @Override
    public void blohahah() {
        System.out.println("aoeoq");
    }
}

public class cwh_26_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle1 =new AvonCycle();
        cycle1.speedUp(5);
        System.out.println(cycle1.a);
        cycle1.blowhorn();
    }
}
