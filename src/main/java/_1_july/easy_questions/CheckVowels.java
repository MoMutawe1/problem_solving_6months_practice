package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a Java program to check if a vowel is present in a string.
public class CheckVowels {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(checkVowels(str));
    }

    private static boolean checkVowels(String str) {
        return str.toLowerCase().matches(".*[aeiuo].*") ? true : false;
    }

    // Answer 2
    /*public static void main(String[] args) {
        String str = "Hello";
        System.out.println(checkVowels(str));
    }

    private static boolean checkVowels(String str) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'u', 'o');

        for(char c: str.toLowerCase().toCharArray())
            return vowels.contains(c) ? false : true;

        return false;
    }*/
}
