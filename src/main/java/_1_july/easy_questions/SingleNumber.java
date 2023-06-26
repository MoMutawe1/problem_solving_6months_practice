package _1_july.easy_questions;

import java.util.HashMap;
import java.util.Map;

// question description: https://leetcode.com/problems/single-number/
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();

        for (int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            if(m.getValue() == 1)
                return m.getKey();
        }
        return -1;
    }
}
