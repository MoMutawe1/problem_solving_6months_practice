package _1_july.easy_questions;

// question description: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FirstOccurrenceInString {

    public static void main(String[] args) {
        String str = "leetcode";
        String subStr = "leet";
        System.out.println(strStr(str, subStr));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }
}
