package com.company;

class Myemployee{
    private int id;
    private String name;

    void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

}

public class cwh_17_getters_setters {
    public static void main(String[] args) {
        Myemployee harry = new Myemployee();
        //harry.id=45;
        //harry.name="cwh"; throws an error due to private access attibutes in class
        harry.setId(123);
        System.out.println(harry.getId());
        harry.setName("zaid");
        System.out.println(harry.getName());


    }
}
