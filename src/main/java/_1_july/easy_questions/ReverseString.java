package _1_july.easy_questions;

import java.util.Arrays;

// question description: https://leetcode.com/problems/reverse-string/
public class ReverseString {

    public static void main(String[] args) {
        char[] charArr = {'H','a','n','n','a','h'};
        reverseString(charArr);
    }

    public static void reverseString(char[] s) {
        int aPointer = 0;
        int zPointer = s.length-1;
        char carry = '0';

        while(aPointer < zPointer){
            carry = s[aPointer];
            s[aPointer] = s[zPointer];
            s[zPointer] = carry;
            aPointer++;
            zPointer--;
        }

        System.out.println(Arrays.toString(s));
    }
}
