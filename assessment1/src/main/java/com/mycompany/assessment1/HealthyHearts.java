package com.mycompany.assessment1;
import java.util.Scanner;

/**
 *@author Darren
 *email: darrenli.inbox@gmail.com
 */

public class HealthyHearts {
    public static void main(String[] args) {
        String age;
        int age_num;
        int max_rate;
        double target_min;
        double target_max;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        age = sc.nextLine();
        age_num = Integer.parseInt(age);
        max_rate = 220 - age_num;
        target_min = 0.5 * max_rate;
        target_max = 0.85 * max_rate;
        System.out.println("Your maximum heart rate should be " + max_rate + " beats per minute.");
        System.out.println("Your target HR should be " + target_min + " - " + target_max + " beats per minute.");
    }
}
