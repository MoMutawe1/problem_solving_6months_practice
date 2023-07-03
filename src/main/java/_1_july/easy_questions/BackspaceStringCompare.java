package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.Stack;

// question description: https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {

    public static void main(String[] args) {
        //String str1 = "ab#c", str2 = "ad#c";
        String str1 = "ab##", str2 = "c#d#";
        //String str1 ="a##c", str2 ="#a#c";
        System.out.println(backspaceCompare(str1, str2));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c: s.toCharArray()){
            if(c != '#') stack1.push(c);
            else if(c == '#' && !stack1.isEmpty() && stack1.peek()!=null) stack1.pop();
        }

        for(char c: t.toCharArray()){
            if(c != '#') stack2.push(c);
            else if(c == '#' && !stack2.isEmpty() && stack2.peek()!=null) stack2.pop();
        }

        return stack1.equals(stack2) ? true : false;
    }


    /*public static boolean backspaceCompare(String s, String t) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        int aIndex = 0, bIndex = 1, xIndex=0, yIndex=1;
        while(bIndex < s.length()){
            if(s.charAt(bIndex) != '#') list1.add(s.charAt(aIndex));
            else {
                aIndex++;
                bIndex++;
            }
            aIndex++;
            bIndex++;
        }
        if(s.charAt(s.length()-1)!='#') list1.add(s.charAt(s.length()-1));

        while(yIndex < t.length()){
            if(t.charAt(yIndex) != '#') list2.add(t.charAt(xIndex));
            else {
                xIndex++;
                yIndex++;
            }
            xIndex++;
            yIndex++;
        }
        if(t.charAt(t.length()-1)!='#') list2.add(t.charAt(t.length()-1));

        System.out.println(list1);
        System.out.println(list2);
        return list1.equals(list2) ? true : false;
    }*/
}
