package com.mycompany.assessment1;

/**
 *@author Darren
 *email: darrenli.inbox@gmail.com
 */

public class SummativeSums {
    public static void main(String[] args) {
        int Array1[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        System.out.println("#1 Array Sum:" + ArraySum(Array1));
        
        int Array2[] = { 999, -60, -77, 14, 160, 301 };
        System.out.println("#2 Array Sum:" + ArraySum(Array2));
        
        int Array3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        System.out.println("#3 Array Sum:" + ArraySum(Array3));
    }
    public static int ArraySum(int input[]){
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            sum += input[i];
        }
        return sum;
    }
}
