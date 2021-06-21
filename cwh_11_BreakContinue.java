package com.company;

public class cwh_11_BreakContinue {
    public static void main(String[] args) {
        //break  and continue using loops
        int i;
        for( i = 0; i<5;i++){
            for (int j = 0; j<5; j++){
                System.out.println(j);
                System.out.println("you enter in j loop");
                if (j==3){
                    System.out.println("j break");
                    break;
                }
            }
            System.out.println("java is great");
            System.out.println(i);
            if(i==3){
                System.out.println("you have entred in break");
                break;
            }
        }
    }
}
