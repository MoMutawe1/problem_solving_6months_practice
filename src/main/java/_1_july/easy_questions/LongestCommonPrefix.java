package _1_july.easy_questions;

// question description: https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];
        for(int i=0; i< strs.length; i++){
            while(strs[i].indexOf(prefix) != 0  )     // if strs[i] is index of prefix that means they're identical.
                prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }
}
