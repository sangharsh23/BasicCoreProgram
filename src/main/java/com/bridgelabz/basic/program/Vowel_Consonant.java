package com.bridgelabz.basic.program;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        char ch = 0;
        Scanner vo = new Scanner(System.in);
        System.out.println("Enter the Alphabet : ");
        ch = vo.next().charAt(0);
        if( ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e'|| ch == 'u' ) {
            System.out.println("It is Vowel");
        }
        else{
            System.out.println("It is Consonant");
        }
    }
}
