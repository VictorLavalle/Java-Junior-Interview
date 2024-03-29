package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberNotRepeated {

    public static void main(String[] args) {
        int[] numbers = {3, 4, 4, 3, 5, 1, 5, 7, 8, 8, 7};
        checkNumberNotRepeated0(numbers);
        checkNumberNotRepeated(numbers);

        List<Integer> otherNumbers = Arrays.asList(3, 4, 4, 3, 5, 1, 5, 7, 8, 8, 7);
        checkNumberNotRepeated2(otherNumbers);
        //checkNumberNotRepeated3(otherNumbers);
    }

    //Solution #0 - Using a for loop --> Not recommended because it is not the best way to do it
    public static void checkNumberNotRepeated0(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("The number not repeated is: " + numbers[i]);
                break;
            }
        }
    }


    //Solution #1 - Use of XOR operator, but only works with numbers that are not repeated twice or more
    public static void checkNumberNotRepeated(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result ^= number;
        }
        System.out.println("The number not repeated is: " + result);
    }


    //Solution #2 - Use of HashMap and part of functional programming
    public static void checkNumberNotRepeated2(List<Integer> numbers) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The number not repeated is: " + entry.getKey());
                break;
            }
        }
    }




    //Solution #3 - Java Functional
    public static void checkNumberNotRepeated3(List<Integer> numbers) {
        Map<Integer, Long> map = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .ifPresent(entry ->
                        System.out.println("The number not repeated is: " + entry.getKey()));
    }
}
