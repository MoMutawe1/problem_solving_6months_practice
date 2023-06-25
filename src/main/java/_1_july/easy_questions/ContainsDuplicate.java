package _1_july.easy_questions;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!hs.add(nums[i]))
                return true;
        }
        return false;
    }
}
