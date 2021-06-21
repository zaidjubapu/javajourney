package com.company;

interface camera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording the 4K video");
    }
}

interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phonenum){
        System.out.println("calling to " + phonenum);
    }
    void pickCall(){
        System.out.println("picking the call");
    }
}

class Sp extends CellPhone implements wifi,camera{

    @Override
    public void takeSnap() {
        System.out.println("taking the snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording the video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting list of Networks");
        String[] Networklist = {"zaid","harry","jarry"};
        return Networklist;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting to " + network);
    }
}

public class cwh_27_DefaultMethods {
    public static void main(String[] args) {
        Sp s1 = new Sp();
        s1.record4kVideo();
        //s1.takeSnap();
        String[] ar = s1.getNetworks();
        for (String item: ar) {
            System.out.print( item + " ");
        }
    }
}
