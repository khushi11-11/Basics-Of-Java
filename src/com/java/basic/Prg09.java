package com.java.basic;

import java.util.Scanner;

//9. Perimeter Of Equilateral Triangle
public class Prg09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of triangle : ");
        int side = input.nextInt();
        double perimeter = 3 * side;
        System.out.println("Perimeter of an equilateral triangle is " + perimeter);
    }
}
