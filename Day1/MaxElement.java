package com.company;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        int num1 = sc.nextInt();
        System.out.println(" Enter second number");
        int num2 = sc.nextInt();
        System.out.println(" Enter third number");
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println("Greater number is " + num1);
            } else {
                System.out.println("Greater number is " + num3);
            }
        }
        else {
            if (num2 > num3) {
                System.out.println("Greater number is " + num2);
            } else {
                System.out.println("Greater number is " + num3);
            }

        }
    }
}
