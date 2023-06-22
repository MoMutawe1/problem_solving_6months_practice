package _1_july.medium_questions;

// question description: https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,1,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSubArr = Integer.MIN_VALUE;

        for(int i: nums) {
            sum = Math.max(sum, 0) + i;     // Reset ‘sum’ to 0 if the total with the next element is negative (we are starting a new subarray with each positive value we get from the array)
            maxSubArr = Math.max(maxSubArr, sum);   // updating the 'maxSubArr' with the new incremented value.
        }
        return maxSubArr;
    }
}
