package com.Garvit;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // find the largest of the three number

        //approach 1

       /* int max = a;
        if(b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);



        // approach 2

        int max = 0 ;
        if(a > b){
            max=a;
        }else{
            max=b;
        }
        if(c > max){
            max=c;
        }
        System.out.println(max);

        */
        // approach 3

        int max = Math.max( c, Math.max(a,b) );
        System.out.println(max);

    }

}
