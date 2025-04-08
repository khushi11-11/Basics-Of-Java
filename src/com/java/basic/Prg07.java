package com.java.basic;

import java.util.Scanner;

//7. Area Of Equilateral Triangle
public class Prg07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of the triangle: ");
        int side = input.nextInt();
        double area = (((Math.pow(3, 0.5)) / 4) * (Math.pow(side, 2))); // root 3 by 4 of side square
        System.out.println("The area of equilateral triangle is " + area);
    }
}
