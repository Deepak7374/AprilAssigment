package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        if (n==2 || n==3)
            System.out.println("Prime number");
        else if(n==0 || n==1 ||n%2==0 || n%3==0 )
            System.out.println("This is not prime number");

        else
            System.out.println("prime Number");
    }
}
