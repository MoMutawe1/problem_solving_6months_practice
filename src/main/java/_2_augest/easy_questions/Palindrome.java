package _2_augest.easy_questions;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A));
    }

    public static String isPalindrome(String str){
        char[] palArr = str.toCharArray();
        int start = 0;
        int end = palArr.length-1;
        while(start < end){
            if(palArr[start] != palArr[end])
                return "No";
            start++;
            end--;
        }
        return "Yes";
    }
}
