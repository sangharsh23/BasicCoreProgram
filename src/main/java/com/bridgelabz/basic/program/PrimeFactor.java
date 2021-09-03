package com.bridgelabz.basic.program;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number to find prime factor: ");
        int num = sc.nextInt();

        for(i = 2; i < num; i++){

            while (num % i == 0 ){
                System.out.println( i + " ");
                num = num / i ;
            }
        }
        if(num > 2 ){
            System.out.println(num);
        }
        }
    }
