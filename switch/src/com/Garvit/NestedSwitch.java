package com.Garvit;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       /*
        int empID = in.nextInt();

        String department =in.next();

        switch (empID) {
            case 1:
                System.out.println("Garvit");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
                break;
        }
        */

        // better way to write it is
        int empID = in.nextInt();
        String department =in.next();

        switch (empID) {
            case 1 -> System.out.println("Garvit");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }


    }
}
