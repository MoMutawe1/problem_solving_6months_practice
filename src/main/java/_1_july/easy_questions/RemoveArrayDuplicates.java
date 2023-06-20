package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.List;

// question description: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveArrayDuplicates {

    public static void main(String[] args) {
        int[] sortedArr = {1, 3, 3, 5, 6, 8, 8, 12};
        System.out.println(removeDuplicates(sortedArr));
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        int counter = 0;
        for(int i: nums){
            if(!resultList.contains(i))
                resultList.add(i);
            else counter++;
        }
        System.out.println(resultList);
        return counter;
    }
}
