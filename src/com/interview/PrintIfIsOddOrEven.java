package com.interview;

import java.util.Arrays;
import java.util.List;

public class PrintIfIsOddOrEven {

    /**
     * Instructions:
     * Define a method that accepts a list of Integers, and prints each one,
     * along with a text that indicates if it's odd or even.
     */

    public static void main (String args[]){

        //Solution
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        printOddEven(numbers);
    }

    //Solution
    public static void printOddEven(List<Integer> numbers) {
        for (int number : numbers) {
            String oddEven = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " is " + oddEven);
        }
    }


}
