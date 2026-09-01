package com.Garvit;

import java.util.Scanner;

public class Greeting_To_Name {
    public static void main(){
        System.out.print("Enter your name:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println( "Hello " + name + " Have a nice day !");
    }
}
