package com.company;
import java.util.Scanner;

public class cwh_12_ps_loops {
    public static void main(String[] args) {
        // question no 1 pattern printing
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the no : ");
        int inp = sc.nextInt();
        int i,j;
        for ( i=inp; i>0;i--){
            for (j=i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("enter the no : ");
        int inpj = sc.nextInt();
        //int i,j;
        for ( i=1; i<=inpj;i++){
            for (j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // practice problem 2
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no : ");
        int inp = sc.nextInt();
        int sum =0;
        while (0<inp){
            if (inp%2 == 0){
                sum=sum+inp;
            }
            inp--;
        }
        System.out.println(sum);
        // practice problem 3
        int n=4;
        int i,total;
        for (i=1;i<=10;i++){
            total = n*i;
            System.out.println(n+" * " +i +" = " + total);
        }
        // practice problem 4
        int n = 10;_
        int i,total =0;
        for(i=fact;i>0;i--){
            total = total+i;
        }
        System.out.println(total);*/
        // practice problem 6 factorial of a given no
        int fact = 5;
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter the no : ");
        //int inp = sc.nextInt();
        int i,total =0;
        while (fact >0){
            total = total+fact;
            fact--;
        }
        System.out.println(total);
        String s=sc.nextLine();
        System.out.println(s);
    }
}
