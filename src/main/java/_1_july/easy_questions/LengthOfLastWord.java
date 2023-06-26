package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.List;

// question description: https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        //String input = "a ";
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {

        int pointer = s.length()-1;
        int lengthOfLastWord = 0;

        while (pointer>=0 && s.charAt(pointer) == ' ')
            pointer--;

        while (pointer>=0 && s.charAt(pointer) != ' ') {
            lengthOfLastWord++;
            pointer--;
        }

        return lengthOfLastWord;
    }
}
