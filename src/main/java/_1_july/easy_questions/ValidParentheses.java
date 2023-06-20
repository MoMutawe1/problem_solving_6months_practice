package _1_july.easy_questions;

import java.util.Stack;

// question description: https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("[{()}]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> input = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '[' || c == '{' || c == '(')
                input.push(c);
            else if (!input.isEmpty() && input.peek().equals('[') && c==']')
                input.pop();
            else if (!input.isEmpty() && input.peek().equals('{') && c=='}')
                input.pop();
            else if (!input.isEmpty() && input.peek().equals('(') && c==')')
                input.pop();
            else return false;
        }
        return input.isEmpty();
    }
}
