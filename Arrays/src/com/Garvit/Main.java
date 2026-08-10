package com.Garvit;

public class Main {
    public static void main(String[] args) {
        // Q.  store a roll number
        int a =19;

        // Q. store a persons name
        String name = "Garvit";

        // Q.  store five roll nonumbers
        // int rno1 =23;
       // int rno2 = 24;
       // int rno3 = 25;

        // Arrays :

        /* Syntax :
         datatype[] variable name = new datatype[size];


        //Q. store 5 roll number

       int[] rno = new int[5];
       // or directly
        int[] rno2 = {23,24,25,26,27};
       */

          int[] ros; // decraration of array . here rno1 is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created
                             // in the memory(heap)

        System.out.println(ros[0]);

        String[] arr=new String[4];
        System.out.println(arr[0]);

        


    }
}
