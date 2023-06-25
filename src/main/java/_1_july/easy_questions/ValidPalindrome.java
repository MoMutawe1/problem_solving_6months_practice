package _1_july.easy_questions;

import java.util.Locale;

// question description:  https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    public static void main(String[] args) {

        String text = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String s) {
        char[] palindromeArr = s.toLowerCase().toCharArray();
        int pointerA = 0, pointerZ = palindromeArr.length-1;

        while(pointerA<pointerZ){
            if(Character.isLetter(palindromeArr[pointerA]) && Character.isLetter(palindromeArr[pointerZ]) && palindromeArr[pointerA] != palindromeArr[pointerZ]) return false;

            while(!Character.isLetter(palindromeArr[pointerA]))
                pointerA++;

            while(!Character.isLetter(palindromeArr[pointerZ]))
                pointerZ--;

            pointerA++;
            pointerZ--;
        }

        return true;
    }
}
