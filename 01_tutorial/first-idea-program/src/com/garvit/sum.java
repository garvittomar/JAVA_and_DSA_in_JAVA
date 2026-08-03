package com.garvit;

import java.util.Scanner;

public class sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 =input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();

        int sum = num1 + num2 ;
        System.out.println("Sum = " + sum);

    }
}
