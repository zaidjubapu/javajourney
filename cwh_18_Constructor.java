package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(int i,String s){
        id = i;
        name = s;
    }

    public void setName(String n){ this.name=n; }
    public String getName(){ return name; }
    public void setId(int i){ this.id = i; }
    public int getId(){ return id; }

}

public class cwh_18_Constructor {
    public static void main(String[] args) {
        MyMainEmployee zaidd = new MyMainEmployee(123,"zaid");
        System.out.println(zaidd.getName());
    }
}
