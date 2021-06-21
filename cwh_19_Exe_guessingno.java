package com.company;
import java.util.Scanner;
class GuessingGame{
    int no_of_guesses;
    int randomnumber;

    public int getNo_of_guesses() {
        return no_of_guesses;
    }

    public void setNo_of_guesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }

    String isCorrectNumber(int x){
        if (x == randomnumber){
            return "you guessed correctly";
        }
        else if (x > randomnumber){
            return "you have guessed the greater no";
        }
        else return "you guessed lower no";
    }

    GuessingGame(int y){
        randomnumber = y;
    }

}

public class cwh_19_Exe_guessingno {
    public static void main(String[] args) {
        int i =1;
        String guessed;
        System.out.println("you have only 5 round");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no which you want to guess");
        GuessingGame g1 = new GuessingGame(sc.nextInt());

        while (true) {
            if (i == 5){
                System.out.println("you lost the game");
                break;
            }


            System.out.println("please enter the no : ");
            guessed = g1.isCorrectNumber(sc.nextInt());

            if (guessed == "you guessed correctly"){
                int b = g1.getNo_of_guesses();
                System.out.println("hurray YOu guessd! in "+ b +"th round");
                break;

            }
            else if (guessed == "you have guessed the greater no"){
                i=i+1;
                g1.setNo_of_guesses(i);
                System.out.println("ohh you have guess the greater no");
            }
            else {
                i=i+1;
                g1.setNo_of_guesses(i);
                System.out.println("ohh you have guess the lesser no");
            }



        }

    }
}
