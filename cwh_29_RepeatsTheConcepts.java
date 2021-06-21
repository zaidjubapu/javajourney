package com.company;
class VarArgs{
    int sum(int a,int b){
        return a+b;
    }
    int summm(int ...arr){
        int sum = 0;
        for (int element:arr) {
            sum += element;
        }
        return sum;
    }
}

class GettersSetters{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}


public class cwh_29_RepeatsTheConcepts {
    /*public static void main(String[] args){
        VarArgs va = new VarArgs();
        int d = va.sum(1,2);
        int arr = va.summm(1,2,3);
        System.out.println(d);
        System.out.println(arr);
    }*/

    /*public static void main(String[] args){
        GettersSetters obj = new GettersSetters();
        obj.setId(123);
        System.out.println(obj.getId());
    }*/

}

