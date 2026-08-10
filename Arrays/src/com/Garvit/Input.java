package com.Garvit;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives:

        int[] arr=new int[5];
        arr[0] =23;
        arr[1] = 45;
        arr[2] = 35;
        arr[3] = 65;
        arr[4] = 75;
        // [23,45,35,65,75]
      //  System.out.println(arr[3]);


       //Ways to print array below are three king you can do so :

//        // input using for loops:
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=in.nextInt();
//
//        }



//        System.out.println(Arrays.toString(arr));  // easy and one of best one to do so



//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

//       for(int num : arr){ // for every element in array,print the element
//           System.out.println(num + " "); // here num represents element of the array
//       }




        //Array of objects :
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        // System.out.println(Arrays.toString(str));


        //modify
        str[1]="Garvit";

        System.out.println(Arrays.toString(str));






        }
}
