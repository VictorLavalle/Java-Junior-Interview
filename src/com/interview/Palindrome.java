package com.interview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myString = scanner.nextLine();

        if (isValidWord(myString)){

            if (checkPalindrome(myString)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }

    public static boolean isValidWord(String word){

        boolean isAllLowerCase = true;
        boolean valid = true;

        for (int i=0; i < word.length(); i++){
            char character = word.charAt(i);

            if (!Character.isLowerCase(character) && word.length() > 50) {
                isAllLowerCase = false;
                valid = false;
                break;
            }
        }

        return valid;

    }

    public static boolean checkPalindrome(String word){

        StringBuilder wordBackwards = new StringBuilder();
        boolean isPalindrome = true;

        for (int i = word.length() - 1; i >= 0; i--){
            wordBackwards.append(word.charAt(i));
        }

        if (!word.contentEquals(wordBackwards)){
            isPalindrome = false;
        }

        return isPalindrome;

    }

}
