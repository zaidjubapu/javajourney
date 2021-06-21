package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class cwh_07_switchstatement {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age : ");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("your are going to become an adult");
                break;// if we dont use the break then all cases will execute
            case 23:
                System.out.println("your are going to join a job");
                break;
            case 60:
                System.out.println("your are going to be retried");
                break;
            default:
                System.out.println("thankyou");
        }
    }
}
