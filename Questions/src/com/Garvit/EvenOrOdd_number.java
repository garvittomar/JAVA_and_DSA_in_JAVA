package com.Garvit;

import java.util.Scanner;

public class EvenOrOdd_number {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hey, this program show number you enter whether it is even or odd : ");
        System.out.print("Enter your number :");
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even number!");
        }else {
            System.out.println("Odd number!");
        }

    }
}
