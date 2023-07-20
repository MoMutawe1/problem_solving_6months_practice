package _1_july.easy_questions;

import java.util.Arrays;

// How do you implement a binary search in Java?
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {32, 14, 11, 78, 55, 7, 61};
        int target = 11;
        System.out.println( binarySearch(arr, target));
    }

    // return index of target
    private static int binarySearch(int[] arr, int target) {
        int first = 0;
        int last = arr.length-1;
        Arrays.sort(arr);

        while (first < last){
            int mid = first + (last - first)/2;
            if(target == arr[mid])
                return mid;
            else if(target < arr[mid])
                last = mid-1;
            else if(target > arr[mid])
                first = mid+1;
        }
        return last;
    }


}
