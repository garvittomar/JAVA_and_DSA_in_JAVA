package com.Garvit;

import java.util.Scanner;

public class Rupees_to_USD {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Amount in Rupees: ");
       int r = in.nextInt();
        System.out.println("Amount in USD is :-");
        int USD = r * 95;
        System.out.println("$"+USD);

        
    }
}
