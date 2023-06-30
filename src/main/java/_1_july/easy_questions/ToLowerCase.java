package _1_july.easy_questions;

import java.util.Locale;

// question description: https://leetcode.com/problems/to-lower-case
public class ToLowerCase {
    public static void main(String[] args) {
        String str = "Programming is Easy";
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c))
                result.append((char)(c+32));
            else
                result.append(c);
        }
        return result.toString();
    }
}
