package com.java.basic;

import java.util.Scanner;

public class Prg22_subtract_the_product_and_sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

//        for separating all the  digits of the integer
        int sum = 0, product = 1, rem;
        while (num > 0) { // 1234
            rem = num % 10; // 1234 % 10 = 4, 123%10 = 3, 2, 1
            sum = sum + rem; // 4, 4+3=7, 9, 10
            product = product * rem; // 1*4=4, 4*3=12, 12*2=24, 24*1=24
            num = num/10; // 1234 / 10 = 123, 123/10 = 12, 1, 0
        }

        int diff = Math.abs(sum - product);
        System.out.println("Sum of digits is: " + sum);
        System.out.println("Product of digits is: " + product);
        System.out.println("Difference is: " + diff);
    }
}
