package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Swap_Two_No {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner no = new Scanner(System.in);
        System.out.println("Enter the num1 before swap: ");
        num1 = no.nextInt();
        System.out.println("Enter the num2 before swap");
        num2 = no.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("num1 and num2 after swapping ");
        System.out.print("num1 = " + num1 + ", num2 = " + num2);

    }
}




