package _1_july.easy_questions;

import java.util.Arrays;
import java.util.List;

// How do you check if a list of integers contains only odd numbers in Java?
public class OddNums {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(findOdds(nums));
    }

    private static boolean findOdds(List<Integer> nums) {
        for(int i: nums)
            if(i%2==0) return false;
        return true;
    }
}
