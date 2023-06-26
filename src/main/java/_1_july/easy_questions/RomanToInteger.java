package _1_july.easy_questions;


import java.util.LinkedHashMap;
import java.util.Map;

// question description: https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    public static void main(String[] args) {
        String inputStr = "MCMXCIV";
        System.out.println(romanToInt(inputStr));
    }

    public static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> romanNum = new LinkedHashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        for(int i=0; i<s.length(); i++){
            if(i+1 == s.length() || romanNum.get(s.charAt(i)) >= romanNum.get(s.charAt(i+1)))
                result += romanNum.get(s.charAt(i));
            else {
                result += romanNum.get(s.charAt(i+1)) - romanNum.get(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}
