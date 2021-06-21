package com.company;
import java.util.Scanner;

public class cwh_05_TakingUserInput {
    public static void main(String[] args){
        /*System.out.println("Taking user input");
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = inp.nextInt();
        System.out.println("entered no is"+ a );
        boolean b1 = inp.hasNextInt(); // it will check whether it is a int or not , and will return a boolean vlue
        System.out.println(b1); // it will print true or false depend upon user input
        String c = inp.next(); // next method is just used to return first word from the whole sentence
        System.out.println(c); // it will just print a word
        String b = inp.nextLine(); // it will return whole sentence
        System.out.println(b);*/
        System.out.println("enter the no of participants");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr1 = new float[n];
        for (int i=0; i<n;i++){
            System.out.println("enter the "+ i + "th element");
            arr1[i]=sc.nextFloat();

        }
        //float a = 0;
        for (int j = 0; j< arr1.length;j++){
            for(int v = 0; v<(arr1.length) - j-1;v++){
                if (arr1[v] < arr1[v+1]){
                    float temp = arr1[v];
                    arr1[v] = arr1[v+1];
                    arr1[v+1] = temp;
                }

            }

        }
        System.out.println("the top 3 numbers are ");
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }





    }
}
