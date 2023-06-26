package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.List;

// question description: https://leetcode.com/problems/pascals-triangle-ii
public class PascalsTriangle2 {

    public static void main(String[] args) {
        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> first_row = new ArrayList<>();

        first_row.add(1);
        triangle.add(first_row);

        for(int i=1; i<=rowIndex; i++){
            List<Integer> previous_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for(int j=1; j<i; j++){
                row.add(previous_row.get(j-1) + previous_row.get(j));
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}
