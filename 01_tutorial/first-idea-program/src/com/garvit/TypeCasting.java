package com.garvit;


import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

       /* float num =input.nextFloat();

        int num =input.nextInt();
        System.out.println(num);


        // Now TypeCasting is this

        int num = (int)(56.43f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a=257;
        byte b =(byte)(a);  // 257 % 256 = 1 because the maximum value of byte is 256


        byte a = 40;
        byte b = 50;
        // look 40*50=2000  exceeds the value of byte
        // so java automatically promoting it to integer value
        // to solve problen
        byte c = 100;
        int d =  a * b  / c ;
        System.out.println(d);

      // java follow the unicode principles
        // if we give variable letter or other ascai value will be printed
       int number = 'A';
        System.out.println(number);

   // you can see the rules for this is accordingly
        // to the rules defined to the java

        System.out.println(3 * 5);
*/
     //   so in one short type casting and conversion is :

        byte b = 42;
        char c ='a';
        short s =1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + ( i / c) - ( d * s );
        // output is float + int - double = double
        System.out.println( (f * b) + " " + ( i / c ) + " " + ( d * s ) );
        System.out.println(result);
    }
}
