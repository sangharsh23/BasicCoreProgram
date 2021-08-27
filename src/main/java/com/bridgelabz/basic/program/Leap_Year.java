package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter the year value: ");

        int year = yr.nextInt();

        if (year % 4 == 0 && year % 400 == 0 || year % 100 ==0) {
            System.out.println("It is leap year");

        }
        else {
            System.out.println("It is not a leap year");
        }

    }
}

