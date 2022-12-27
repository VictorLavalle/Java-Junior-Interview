package com.interview;

/**
 * INSTRUCTIONS:
 * Write a method that sums the items in an Array of integers according to following rules:
 * If the number is even sum +1 points
 * If the number is odd sum +3 points
 * If the number is 0 stop summing
 *
 */

public class SumIfIsOddOrEven {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 0, 6, 7};

        //Solution
        int result = SumIfIsOddOrEven.sumArray(testArray);
        System.out.println(result);
    }

    //Solution
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                sum += 1;
            } else {
                sum += 3;
            }
        }
        return sum;
    }

}
