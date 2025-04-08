package com.java.basic;

import java.util.Scanner;

public class Prg24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;


        System.out.print("Enter a number : "); // let num = 3
        int num = input.nextInt(); // num = 3
        while ( num != 0 ) {
            sum = sum + num; // sum = 0+3 = 3
            System.out.print("Enter a number : ");
            num = input.nextInt(); // num = 4 ; loop continues
        }


//        int num;
//        do {
//            System.out.print("Enter a number : ");
//            num = input.nextInt();
//            sum = sum + num;
//        } while (num != 0);

        System.out.println("Sum of all the entered input values is " + sum);
    }
}
