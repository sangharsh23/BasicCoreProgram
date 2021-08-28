package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Quotient_Rem {
        public static void main(String[] args) {

            float dividend = 0,div_sor = 0;
            Scanner qo = new Scanner(System.in);

            System.out.println("Enter the divided value : ");
            dividend = qo.nextInt();

            System.out.println("Enter the divisor value : ");
            div_sor = qo.nextInt();

            float quotient = dividend / div_sor;
            System.out.println("Quotient = " + quotient);

            float remainder = dividend % div_sor;
            System.out.println("Remainder = " + remainder);
        }
    }



