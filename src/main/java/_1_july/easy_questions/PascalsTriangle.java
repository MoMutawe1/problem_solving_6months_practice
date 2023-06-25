package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.List;

// question description: https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> first_row = new ArrayList<>();

        first_row.add(1);
        triangle.add(first_row);

        for(int i=1; i<numRows; i++){
            List<Integer> previous_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for(int j=1; j<i; j++){
                row.add(previous_row.get(j-1) + previous_row.get(j));
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
}
