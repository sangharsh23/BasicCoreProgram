package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Even_Odd {
        public static void main(String[] args) {
            int num = 0;
            Scanner no = new Scanner(System.in);
            System.out.println("Enter the number ");
            num = no.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even ");
            } else {
                System.out.println("Odd");

            }
        }
    }


