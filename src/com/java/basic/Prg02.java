package com.java.basic;

import java.util.Scanner;

// Area Of Triangle
public class Prg02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of △: ");
        int base = input.nextInt();
        System.out.print("Enter height of △: ");
        int height = input.nextInt();
        double area = (double) (base * height) / 2; // explicit type-casting using (double) keyword on rhs
        System.out.println("The area of triangle is " + area);
    }
}
