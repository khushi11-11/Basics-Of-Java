package com.basic.prg1;

import java.util.Scanner;
// class used for taking user's input

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.in used when std input is to be taken from the keyboard
//        sc is an object of Scanner class

        System.out.println(sc.nextInt());
//        will display whatever the user inputs in the terminal
//        but it must be an integer, as we used nextInt, anything else will give an error

        System.out.println(sc.next());
//        next for string but only till a space is encountered (delimiter-whitespace)
//        eg. Hey, how are you - input string will only give "Hey" as output
        System.out.println(sc.nextLine());
//        for complete string (eg. Hey, how are you?)
    }
}
