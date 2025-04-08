package com.java.basic;

import java.util.Scanner;

public class Prg25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter a number : ");
        num1 = input.nextInt(); // num1 = 23

        do {
            System.out.print("Enter another number : ");
            num2 = input.nextInt(); // num2 = 34

            if (num1 > num2) { // 23>34 = false -> else stmt
//                num1 will remain same
            } else {
                num1 = num2; // num1 = 34 -> will take another input for num2
            }
        } while (num2 != 0);

        System.out.println("The largest number is " + num1);
    }
}
