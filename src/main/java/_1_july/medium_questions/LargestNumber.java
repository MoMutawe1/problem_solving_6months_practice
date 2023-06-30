package _1_july.medium_questions;

import java.util.Arrays;

// question description: https://leetcode.com/problems/largest-number
public class LargestNumber {

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums){
        StringBuilder sb = new StringBuilder();
        int n = nums.length;
        String[] strArr = new String[n];

        for(int i=0; i<nums.length; i++)
            strArr[i] = Integer.toString(nums[i]);

        Arrays.sort(strArr, (element1, element2) -> (element1 + element2).compareTo(element2 + element1));

        for(int i=strArr.length-1; i>=0; i--)
            sb.append(strArr[i]);

        return sb.toString().startsWith("0") ? "0" : sb.toString();
    }
}
