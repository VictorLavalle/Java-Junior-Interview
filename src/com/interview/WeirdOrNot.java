package com.interview;


//Instructions:
//Given an integer, , perform the following conditional actions:
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//Input Format:
//A single line containing a positive integer, n .
//
//Constraints
// 1 <= n <= 100
//
//Output Format
//Print Weird if the number is weird; otherwise, print Not Weird.

import java.util.Scanner;

public class WeirdOrNot {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean testNumberValid = WeirdOrNot.isNumberValid(N);

        String testNumber = WeirdOrNot.isWeird(N, testNumberValid);

        scanner.close();
        
        System.out.println(testNumber);

    }


    public static boolean isNumberValid(int number){
        boolean isValid = number >= 1 && number <= 100;

        return isValid;

    }

    public static String isWeird(int number, boolean valid){

        String status = "";

        if (valid) {

            if (number % 2 != 0 || number >= 6 && number <= 20){
                status = "Weird";
                //System.out.println(status);
            }

            else if (number >= 2 && number <= 5 || number > 20){
                status = "Not Weird";
                // System.out.println(status);
            }
        }
        else {
            status = "Not Valid";
        }

        return status;
    }

}