package _1_july.easy_questions;

// question description: https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] inputsArr = {1,3,5,6,8};
        int target = 7;

        System.out.println(searchInsert(inputsArr, target));
    }

    public static int searchInsert(int[] inputsArr, int target) {

        int min=0;
        int max=inputsArr.length-1;

        while (max>=min){
            int mid = min + (max-min)/2;
            if(target == inputsArr[mid])
                return mid;
            else if(target<inputsArr[mid])
                max=mid-1;
            else
                min=mid+1;
        }
        return max+1;
    }
}
