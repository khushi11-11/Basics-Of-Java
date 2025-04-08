package com.java.intermediate;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Prg05_dist_bw_2pts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x-coordinate of point P1: ");
        int x1 = input.nextInt();
        System.out.print("Enter y-coordinate of point P1: ");
        int y1 = input.nextInt();
        System.out.print("Enter x-coordinate of point P2: ");
        int x2 = input.nextInt();
        System.out.print("Enter y-coordinate of point P2: ");
        int y2 = input.nextInt();

        int a = (x2 - x1)*(x2 - x1);
        int b = (y2 - y1)*(y2 - y1);
        double distance = sqrt(a + b);

        System.out.println("Distance between these 2 points is " + distance + " units.");
    }
}
