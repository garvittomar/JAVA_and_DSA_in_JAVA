package com.Garvit;

import java.util.Scanner;

public class _2_number_calculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a =in.nextInt();
        System.out.print("Enter 2nd number: ");
        int b =in.nextInt();
        System.out.print("Enter the operation out of * , - , +, / : ");
        String  op =in.next();

        if (op.equals("+")) {
            System.out.println(a+b);
        } else if (op.equals("-")) {
            System.out.println(a-b);
        } else if (op.equals("*")) {
            System.out.println(a * b);
        } else if   (op.equals("/")) {
            if (b!=0){
                System.out.println(a/b);
            }else {
                System.out.println("cant divide by zero");
            }
        }else {
            System.out.println("Enter valid operator !");
        }


    }
}
