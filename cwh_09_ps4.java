package com.company;
import java.util.Scanner;

public class cwh_09_ps4 {
    public static void main(String[] args) {
        //q1
        /*int  a =10;
        if (a=11)
            System.out.println();*/
        //q2
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter the first subject marks : ");
        float marks1=sc.nextFloat();
        System.out.println("enter the second subject marks : ");
        float marks2=sc.nextFloat();
        System.out.println("enter the third subject marks : ");
        float marks3=sc.nextFloat();

        float total = ((marks1+marks2+marks3)/300)*100;
        if (marks1 <33){
            System.out.println("the student is fail");
        }
        else if (marks2 <33){
            System.out.println("the student is fail");
        }
        else if (marks2 <33){
            System.out.println("the student is fail");
        }
        else if (total < 40){
            System.out.println("the student is fail");
        }
        else {
            System.out.println("the student is pass");
        }*/
        //q3
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount < 250000){
            System.out.println("1no tax has been taken from the employee");
        }
        else if (amount >= 250000 && amount<500000){
            float tax = (amount * (5.0f/100));
            System.out.println("2the tax amount paid by an employee is : " +tax);
        }
        else if (amount >= 500000 && amount<1000000){
            float tax = amount*(20.0f/100);
            System.out.println("3the tax amount paid by an employee is : " +tax);
        }
        else if (amount >=1000000){
            float tax = amount*(30.0f/100);
            System.out.println("4the tax amount paid by an employee is : " +tax);
        }

    }
}
