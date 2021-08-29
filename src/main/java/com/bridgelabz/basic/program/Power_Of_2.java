package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Power_Of_2 {
    public static void main(String[] args) {
        double n, i;
        int t = 0;
        Scanner cd = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        n = cd.nextInt();

        for (i = n; i <= 31; i++) {
           t = (int) Math.pow(n,i);
            System.out.println("Table of 2 is : " + t);
        }
    }
}