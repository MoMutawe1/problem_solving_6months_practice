package _1_july.easy_questions;

import java.util.HashMap;

// question description: https://leetcode.com/problems/majority-element/
public class MajorityElement {

    public static void main(String[] args) {
        int[] elements = {3,2,3,2,2,3};
        System.out.println(majorityElement(elements));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxValue = 0, result = 0;

        for(int i: nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);

            if(hm.get(i)>maxValue) {
                maxValue = hm.get(i);
                result = i;
            }
        }
        return result;
    }
}
