package com.basic.prg1;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter first number ");
        int a = num.nextInt();
        System.out.print("Enter second number ");
        int b = num.nextInt();
        int sum = a + b;

        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
}
