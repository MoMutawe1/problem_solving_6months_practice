package _1_july.medium_questions;

import java.util.*;

// question description: https://leetcode.com/problems/count-and-say/
public class CountAndSay {

    public static void main(String[] args) {
        int str = 5;
        System.out.println(countAndSay(str));
    }

    public static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        for(int count=1; count<n; count++){
            sb = countIdx(sb);
        }
        return sb.toString();
    }

    public static StringBuilder countIdx(StringBuilder s){
        StringBuilder result = new StringBuilder();
        char value = s.charAt(0);
        int repetition = 1;
        for(int counter=1; counter<s.length(); counter++){
            if(s.charAt(counter) == value){
                repetition++;
            }
            else
            {
                result.append(repetition);
                result.append(value);
                value = s.charAt(counter);
                repetition = 1;
            }
        }
        result.append(repetition);
        result.append(value);
        return result;
    }

    // first try: input 3322251  expected output 23321511
    /*public static String countAndSay(int n) {
        String str = Integer.toString(n);
        LinkedHashMap<Character, Integer> resultMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();

        for(char c: str.toCharArray()){
            if(resultMap.containsKey(c))
                resultMap.put(c, resultMap.getOrDefault(c, 0)+1);
            else resultMap.put(c, 1);
        }
        System.out.println("map values " + resultMap);
        for(Map.Entry<Character, Integer> e: resultMap.entrySet()){
            sb.append(e.getValue());
            sb.append(e.getKey());
        }

        return sb.toString();
    }*/
}
