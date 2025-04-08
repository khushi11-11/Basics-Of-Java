package com.java.basic;

import java.util.Scanner;

public class Prg21_fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        System.out.println("Fibonacci series till " + n + " values is: ");

        int a = 0, b = 1;
        int temp = a + b;

        System.out.print(a + ", " + b + ", " + temp); // 0, 1, 1
        for (int i = 1; i <= n-3; i++) {
            a = b; // a=1 : updated val
            b = temp; // b=1 : updated val
            temp = a + b; // temp=1+1 = 2
            System.out.print(", " + temp);
        }
    }
}
