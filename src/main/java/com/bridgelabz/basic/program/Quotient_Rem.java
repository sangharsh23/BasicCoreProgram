package com.bridgelabz.basic.program;

public class Quotient_Rem {
        public static void main(String[] args) {

            int dividend = 28;
            int div_sor = 8;

            int quotient = dividend / div_sor;
            System.out.println("Quotient = " + quotient);

            int remainder = dividend - (div_sor * quotient);
            System.out.println("Remainder = " + remainder);
        }
    }



