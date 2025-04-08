package com.java.basic;

import java.util.Scanner;

public class Prg23_all_factors_of_a_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Factors of " + num + " are:");
        for( int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
