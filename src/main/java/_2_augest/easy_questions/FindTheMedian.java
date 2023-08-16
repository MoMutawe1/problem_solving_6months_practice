package _2_augest.easy_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 9, 12, 14, 19, 5, 3);
        System.out.println("Median Element: " + findMedian(list));
    }

    public static int findMedian(List<Integer> arr) {

        Collections.sort(arr);
        arr.stream().forEach(n-> System.out.print(n + " "));
        System.out.println();
        return arr.get(arr.size()/2);
    }
}
