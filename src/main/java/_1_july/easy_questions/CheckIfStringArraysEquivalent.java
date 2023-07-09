package _1_july.easy_questions;

// question description: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class CheckIfStringArraysEquivalent {

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s: word1) sb1.append(s);
        for(String s: word2) sb2.append(s);

        return sb1.toString().equals(sb2.toString());
    }
}
