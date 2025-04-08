package com.java.intermediate;

import java.util.Scanner;

public class Prg04_discount_calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: ");
        double price = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = input.nextDouble();
        double discounted_price = price - (price * discount)/100;
        System.out.println("Discounted price: " + discounted_price);
    }
}
