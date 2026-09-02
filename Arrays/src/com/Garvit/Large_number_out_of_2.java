package com.Garvit;

import java.util.Scanner;

public class Large_number_out_of_2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1st: ");
        int a =in.nextInt();
        System.out.print("Enter number 2nd: ");
        int b =in.nextInt();
        System.out.println("Largest number is :-");
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
