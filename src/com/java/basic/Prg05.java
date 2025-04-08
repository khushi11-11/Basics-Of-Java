package com.java.basic;

import java.util.Scanner;

//5. Area Of Parallelogram
public class Prg05 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter height of parallelogram: ");
        double height = input.nextDouble();
        System.out.println("Enter base of parallelogram: ");
        double base = input.nextDouble();
        double area = base * height;
        System.out.println("The area of the parallelogram is " + area);
    }
}
