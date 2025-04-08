package com.java.basic;

import java.util.Scanner;

//4. Area Of Isosceles Triangle
public class Prg04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of isosceles △: ");
        int base = input.nextInt();
        System.out.print("Enter height of isosceles △: ");
        int height = input.nextInt();
        double area = (double) (base * height) / 2; // explicit type-casting using (double) keyword on rhs
        System.out.println("The area of isosceles triangle is " + area);
    }
}
