package _1_july.medium_questions;

import java.util.ArrayList;
import java.util.List;

// question description: https://leetcode.com/problems/permutations/
public class Permutations {
    // Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //int[] arr = {0,1};
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        permute(nums, 0, resultList);
        return resultList;
    }

    private static void permute(int[] nums, int index, List<List<Integer>> resultList){
        if(index == nums.length) {
            List<Integer> result = new ArrayList();
            for(int num : nums)
                result.add(num);
            resultList.add(result);
            return;
        }

        for(int i=index; i<nums.length; i++){
            swap(nums, i, index);
            permute(nums, index+1, resultList);
            swap(nums, i, index);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
