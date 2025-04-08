package com.java.basic;

import java.util.Scanner;

//Area Of Rectangle Program
public class Prg03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = input.nextInt();
        int area = length * breadth;
        System.out.print("Area of rectangle is " + area);
    }
}
