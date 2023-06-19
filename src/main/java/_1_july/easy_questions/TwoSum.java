package _1_july.easy_questions;

import java.util.Arrays;
import java.util.HashMap;

// question description: https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {
        int[] inputs = {7,11,15,4,21,2,0,3};
        int target = 9;

        Arrays.stream(getTwoSum(inputs, target)).forEach(n-> System.out.print(n+" "));
    }

    public static int[] getTwoSum(int[] inputs, int target){

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int count=0; count<inputs.length; count++){
            if(hashMap.containsKey(target-inputs[count])){
                return new int[] {count, hashMap.get(target - inputs[count])};
            }
            hashMap.put(inputs[count], count);
        }
        return new int[] {-1,-1};
    }
}
