package com.basic.prg1;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int roll_no = input.nextInt();
//        roll_no is a variable, whatever (as input) is keyed in the console by user is store inside it
        System.out.println("Hey, your roll no is IT-2K21-" + roll_no);
    }
}
