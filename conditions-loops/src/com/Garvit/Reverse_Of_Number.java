package com.Garvit;

import java.util.Scanner;

public class Reverse_Of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type an number whole reverse number you want: ");
        int num = in.nextInt();

        int ans = 0;

        while(num >0 ){
        int rem = num % 10 ;
        num /=10 ;

        ans = ans * 10 + rem;
        }
        System.out.println(ans);


    }
}
