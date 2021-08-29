package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Harmonic_Num {
    public static void main(String[] args) {
        double i,n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Harmonic num : ");
         n = sc.nextDouble();

        for (i = 1; i <= n; i++)
        {
                sum = sum +(1/i);
            }
            System.out.println(" Harmonic value " + sum);

            }
        }
