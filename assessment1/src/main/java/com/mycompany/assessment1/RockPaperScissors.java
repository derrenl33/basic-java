package com.mycompany.assessment1;
import java.util.Scanner;
import java.util.Random;

/**
 *@author Darren
 *email: darrenli.inbox@gmail.com
 */

public class RockPaperScissors {
    public static void main(String[] args) {
        String rounds;
        int num_rounds = 0;

        String choices[] = {"Rock", "Paper", "Scissors"};
        String myChoice;
        int num_choice;
        int comp_choice;

        int wins = 0;
        int losses = 0;
        int ties = 0;
        
        boolean playAgain = false;

        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        //plays once unless user wants to play again 
        do{
            //prompts user for desired number of rounds to play; error on exception
            try {
                System.out.println("How many rounds do you want to play(1-10): ");

                rounds = sc.nextLine();
                num_rounds = Integer.parseInt(rounds);

                if (num_rounds < 1 || num_rounds > 10) {
                    System.out.println("ERROR!");
                    System.exit(0);
                }

                } catch(NumberFormatException ex) {
                    System.out.println("ERROR!");
                    System.exit(0);
                }

            System.out.println();

            //play until desired number of rounds are played
            while(num_rounds > 0){
                //prompts user for rock, paper, or scissors; random if exception
                try {
                    System.out.println("Choose 1, 2, or 3(1=Rock, 2=Paper, 3=Scissors): ");
                    myChoice = sc.nextLine();
                    num_choice = Integer.parseInt(myChoice);

                    if (num_choice < 1 || num_choice > 3) {
                        num_choice = randomizer.nextInt(3) + 1;
                        //System.out.println("Me:" + num_choice);
                    }

                    } catch(NumberFormatException ex) {
                        num_choice = randomizer.nextInt(3) + 1;
                        //System.out.println("Me:" + num_choice);
                    }  
                
                System.out.println();
                System.out.println("Me:" + choices[num_choice-1]);

                //computer chooses show current round result; update counts
                comp_choice = randomizer.nextInt(3) + 1;
                System.out.println("Comp:" + choices[comp_choice-1]);
                if (num_choice == comp_choice){
                    System.out.println("Tie");
                    System.out.println();
                    ties++;
                    num_rounds--;
                }else if(num_choice == 1){
                    if (comp_choice == 2){
                        System.out.println("Computer Wins");
                        System.out.println();
                        losses++;
                        num_rounds--;
                    }else if(comp_choice == 3){
                        System.out.println("You Win");
                        System.out.println();
                        wins++;
                        num_rounds--;
                    }
                }else if(num_choice == 2){
                    if (comp_choice == 3){
                        System.out.println("Computer Wins");
                        System.out.println();
                        losses++;
                        num_rounds--;
                    }else if(comp_choice == 1){
                        System.out.println("You Win");
                        System.out.println();
                        wins++;
                        num_rounds--;
                    }
                }else if(num_choice == 3){
                    if (comp_choice == 1){
                        System.out.println("Computer Wins");
                        System.out.println();
                        losses++;
                        num_rounds--;
                    }else if(comp_choice == 2){
                        System.out.println("You Win");
                        System.out.println();
                        wins++;
                        num_rounds--;
                    }
                }
            }
            
            //final scoreboard and overall winner
            System.out.println("WINS: " + wins);
            System.out.println("LOSSES: " + losses);
            System.out.println("TIES: " + ties);
            if (wins > losses){
                System.out.println("YOU ARE THE OVERALL WINNER!");
                System.out.println();
            }else if (losses > wins){
                System.out.println("COMPUTER IS THE OVERALL WINNER!");
                System.out.println();
            }else if (wins == losses){
                System.out.println("IT IS AN OVERALL TIE!");
                System.out.println();
            }else{
                System.out.println("ERROR");
                System.out.println();
            }
            
            //prompt to start over with new game; exceptions default as No
            System.out.println("Do you want to play again?(Y/N): ");
            if (sc.nextLine().equals("Y")){
                playAgain = true;
                wins = 0;
                losses = 0;
                ties = 0;        
                System.out.println();
            }else{
                playAgain = false;
            }
        }while(playAgain);    
    }
}
