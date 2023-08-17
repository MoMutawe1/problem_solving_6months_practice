package _2_augest.easy_questions;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/problem
public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                                    Arrays.asList(11, 2, 4),
                                    Arrays.asList(4, 5, 6),
                                    Arrays.asList(10, 8, -12)
        );
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int rightToLeftSum = 0, leftToRightSum = 0, result = 0;
        int index = 0, reversedIndex = arr.size() - 1;

        for(List<Integer> integers : arr){
            rightToLeftSum += integers.get(index);
            leftToRightSum += integers.get(reversedIndex);

            index++;
            reversedIndex--;
        }

        result = rightToLeftSum - leftToRightSum;
        return result > 0 ? result : -result;
    }
}
