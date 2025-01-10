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
*/


import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        float num = input.nextFloat();
        System.out.println(num);
    }
}
