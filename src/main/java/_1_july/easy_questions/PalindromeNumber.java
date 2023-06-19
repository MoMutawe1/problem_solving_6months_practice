package _1_july.easy_questions;

// question description: https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isStrPalindrome(121));
        System.out.println(isIntPalindrome(121));
    }

    // with converting the integer input to a string
    public static boolean isStrPalindrome(int x) {

        String input = Integer.toString(x);
        StringBuilder reverceVal = new StringBuilder();

        for(int count=input.length()-1; count>=0; count--){
            reverceVal.append(input.charAt(count));
        }
        return input.equals(reverceVal.toString())? true : false;
    }

    // without converting the integer input to a string
    public static boolean isIntPalindrome(int x) {

        if(x<0) return false;

        int reverse = 0;
        int input = x;

        while (input > 0) {
            int digit = input % 10;          //Retrieve the rightmost digit.
            reverse = reverse * 10 + digit;  //Reversing the input.
            input /= 10;                     //Remove right digit.
        }
        return reverse==x;
    }
}
