package com.java.basic;

import java.util.Scanner;

//6. Area Of Rhombus
public class Prg06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of diagonal 01: ");
        double d1 = input.nextDouble();
        System.out.print("Enter length of diagonal 02: ");
        double d2 = input.nextDouble();
        double area = d1*d2;
        System.out.println("The area of rhombus is " + area);
    }
}
