package com.basic.prg1;

/*
 TYPE CASTING :-
 is the process where 1 'type' of data is assigned to a different 'type' of variable,
 automatically a type conversion will take place
 when the below set of conditions take place,
 1. both the two types should be compatible (like int and float)
 2. destination(float) type should be greater than the source(int) type [int->float] || lhs < rhs

 For, float -> int : narrowing conversion
 explicit conversion
 int num = (int)(67.5f);
 compressing a larger no. to a smaller type, explicitly


 AUTOMATIC TYPE PROMOTION IN EXPRESSIONS :-
 BYTE type has a range of 256, when we write something like byte num = 257, it will give 1 as output
 it basically divides the number with the highest no. in range and gives the remainder as output
*/

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number ");
//        float num = input.nextFloat();
//        System.out.println(num);

        byte b = 40;
        byte a = 50;
        byte c = 100;
        int d = (a*b)/c;
//        System.out.println(d);
// here a*b = 2000 and /c = 20
// why and how is a*b is storing the int type of the result and not the byte type of it
// JAVA automatically promotes the number with lower type to the required type, here int, when evaluating expressions

        byte x = 50;
//        x = x*2;
//        this will give an error, as while evaluating expressions the variables change their type to int
//        which means b*2 is now of type int and now it can no more be stored in the variable x of type byte
//        x is of byte type, but x*2 whole (as expression) is of int type

        int number = 'A';
//        System.out.println(number);
//        gives 65 in output, the ASCII value of 'A', automatic type conversion

        System.out.println("नमस्ते");
        System.out.println("你好");
//        JAVA is a unicode programming language, can print any language
    }
}

