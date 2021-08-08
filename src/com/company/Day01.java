package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day01 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int n;
        double c;
        String o;
        /* Read and save an integer, double, and String to your variables.*/
        n = scan.nextInt();
        c = scan.nextDouble();
        scan.nextLine();
        o = scan.nextLine();

        int sum = i + n;
        double sumDouble = d + c;
        String nString = s + o;

        System.out.println(sum);
        System.out.println(sumDouble);
        System.out.println(nString);
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}