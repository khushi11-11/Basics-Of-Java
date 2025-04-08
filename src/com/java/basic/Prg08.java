package com.java.basic;

import java.util.Scanner;

//8. Perimeter Of Circle
public class Prg08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle is: " + perimeter);
    }
}
