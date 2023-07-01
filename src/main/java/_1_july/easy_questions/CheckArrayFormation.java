package _1_july.easy_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Check Array Formation Through Concatenation
// question description: https://leetcode.com/problems/check-array-formation-through-concatenation/
public class CheckArrayFormation {

    public static void main(String[] args) {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78},{4,64},{91}};
        //int[] arr = {49,18,16};
        //int[][] pieces = {{16,18,49}};

        System.out.println(canFormArray(arr, pieces));
    }

    /*for(Map.Entry<Integer, int[]> i: map.entrySet())
            System.out.println(i.getKey() + Arrays.toString(i.getValue()));*/

    public static boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, int[]> map = new HashMap<>();
        for(int[] piece : pieces)
            map.put(piece[0], piece);   // 4[4, 64] -> 91[91] -> 78[78].

        int[] result = new int[arr.length];
        int counter = 0;

        for(int i: arr) // 91,4,64,78
            for(int p: map.getOrDefault(i, new int[0]))   // 4[4, 64] -> 91[91] -> 78[78]
                result[counter++] = p;  // [91, 4, 64, 78]

        return Arrays.equals(arr, result);
    }

    // solution 2
    /*public static boolean canFormArray(int[] arr, int[][] pieces) {
        int[] result = new int[arr.length];
        int[] reverseResult = new int[arr.length];
        int counter = 0;
        int reverseCounter = 0;

        for(int i=0; i<pieces.length; i++)
            for(int j=0; j<pieces[i].length; j++)
                result[counter++] = pieces[i][j];

        for(int i=pieces.length-1; i>=0; i--)
            for(int j=0; j<pieces[i].length; j++)
                reverseResult[reverseCounter++] = pieces[i][j];

        return Arrays.equals(arr, result) || Arrays.equals(arr, reverseResult);
    }*/
}
