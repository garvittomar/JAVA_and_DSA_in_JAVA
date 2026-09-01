package com.Garvit;

import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Principle amount: ");
        int P = in.nextInt();
        System.out.print("Enter the Time period of amount: ");
        int T =in.nextInt();
        System.out.println("Enter the Rate of interest example -> 2,3,4,5,etc :  ");
        int R =in.nextInt();
        System.out.print("Your Simple Interest is : ");
         int SI = (P*T*R)/100;
        System.out.print(SI);
    }
}
