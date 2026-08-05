package com.Garvit;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the whole number: ");
        int n = in.nextInt();
        System.out.println("Enter the digit which count you want to see: ");
        int a =in.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n%10;
            if( rem == a){
                count++;
            }
            n=n/10 ; // or write n /= 10

        }
        System.out.println(count);


    }
}
