package com.Garvit;

import java.util.Scanner;

public class switch_and_enhancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Switch statement:
        Syntax:
        switch(expression){
        //cases
        case one;
          // do something
          break;
          case two ;
          // do something
          break;
          default ;
          //do something

          }



        System.out.print("Enter fruit name out of MAngo,Apple,Orange,Grapes ; ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit!!");
        }


        System.out.println("Input day number wise and name will be visible: ");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }


        System.out.println("Input day number wise to see its weekday or weekend: ");
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

         */

        //and by enhanced switch
        System.out.println("Input day number wise to see its weekday or weekend: ");
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }



    }
}
