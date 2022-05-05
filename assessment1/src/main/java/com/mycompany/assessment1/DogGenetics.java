package com.mycompany.assessment1;
import java.util.Scanner;
import java.util.Random;
/**
 *@author Darren
 *email: darrenli.inbox@gmail.com
 */

public class DogGenetics {
    public static void main(String[] args) { 
        String name;
        String breed[] = {"Bulldog", "Pomeranian", "Chihuahua", "Pug", "Beagle", "Greyhound"};
        int max = 100;
        int randPercent = 0;

        Scanner sc = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.println("What is your dog's name?");
        name = sc.nextLine();
        System.out.println();
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
        System.out.println();
        System.out.println(name + " is: ");

        randPercent = randomizer.nextInt(max);
        max -= randPercent;
        System.out.println((randPercent)+"% "+ breed[0]);

        randPercent = randomizer.nextInt(max);
        max -= randPercent;
        System.out.println((randPercent)+"% "+ breed[1]);

        randPercent = randomizer.nextInt(max);
        max -= randPercent;
        System.out.println((randPercent)+"% "+ breed[2]);

        randPercent = randomizer.nextInt(max);
        max -= randPercent;
        System.out.println((randPercent)+"% "+ breed[3]);

        randPercent = randomizer.nextInt(max);
        max -= randPercent;
        System.out.println((randPercent)+"% "+ breed[4]);

        System.out.println(max+"% "+ breed[5]);
    }
}
