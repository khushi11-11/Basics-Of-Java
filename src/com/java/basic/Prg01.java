package com.java.basic;

import java.util.Scanner;

// 1. Area Of Circle Java Program
public class Prg01 {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle:");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
