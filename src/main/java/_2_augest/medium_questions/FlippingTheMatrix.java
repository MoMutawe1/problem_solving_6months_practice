package _2_augest.medium_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/flipping-the-matrix/problem
public class FlippingTheMatrix {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(112, 42, 83, 119);
        List<Integer> list2 = Arrays.asList(56, 125, 56, 49);
        List<Integer> list3 = Arrays.asList(15, 78, 101, 43);
        List<Integer> list4 = Arrays.asList(62, 98, 114, 108);

        List<List<Integer>> matrix = Arrays.asList(list1, list2, list3, list4);
        System.out.println(flippingMatrix(matrix));
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int maxUpperLeftSum = 0;
        int size = matrix.size();

        for (int row = 0; row < size/2; row++) {
            for (int i = 0; i < size/2; i++) {
                maxUpperLeftSum += Math.max(
                                        matrix.get(row).get(i),  // get first element of the first row
                                            Math.max( // to compare the columns
                                            matrix.get(row).get(size-1-i), // get last element of the first row then compare with max of last row
                                                Math.max(   // compare first element with last element of the list, then the middle elements
                                                        matrix.get(size-1-row).get(i),  // get first element of the last row
                                                        matrix.get(size-1-row).get(size-1-i)  // get last element of the last row
                                                )
                                            )
                                        );
            }
        }
        return maxUpperLeftSum;
    }
}
