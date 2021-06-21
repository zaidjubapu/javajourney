package com.company;
import java.util.Scanner;
public class cwh_10_ps_rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many times you want to play : ");
        int times = sc.nextInt();

        System.out.println("The Game Is Of " + times + " round");
        int play1 = 0;
        int play2 = 0;
        int i;
        try {
            for (i=0; i<times; i++) {
                System.out.println("choose rock paper or scissor for player1 : ");
                String player1 = sc.next();
                System.out.println("choose rock paper or scissor for player2 : ");
                String player2 = sc.next();
                if ((player1.equals("rock") || player1.equals("scissor") || player1.equals("paper")) && (player2.equals("rock") || player2.equals("scissor") || player2.equals("paper"))) {


                    if (player1.equals(player2)) {
                        System.out.println("the player one choose " + player1 + "and player 2 choose " + player2 + "\n so the game is draw");
                        play1++;
                    } else if ((player1.equals("scissor") && player2.equals("paper")) || (player1.equals("paper") && player2.equals("rock")) || (player1.equals("rock") && player2.equals("scissor"))) {
                        System.out.println("the player one choose " + player1 + "and player 2 choose " + player2 + "\n so player 1 won");
                        play2++;
                    } else
                        System.out.println("the player one choose " + player1 + "and player 2 choose " + player2 + " \n so the player 2 won");
                }
                else {
                    System.out.println("you have entered in correct input");
                }
            }
            if (play1>play2){
                System.out.println("player 1 won the match by taking " + play1 +" points");
            }
            else if (play1<play2){
                System.out.println("player 2 won the match by taking " + play2 +" points");
            }
            else {
                System.out.println("match has draw");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
