package com.java.intermediate;

import java.util.Scanner;

public class Prg03_avg_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        int avg = sum / 5;
        System.out.println("Average is: " + avg);
    }
}
