package _1_july.easy_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// question description: https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 4, 4, 9, 13, 19, 21);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 10, 13, 16, 20);

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();
        int list1_counter = 0;
        int list2_counter = 0;

        while (list1_counter<list1.size() && list2_counter<list2.size()){
            if(list1.get(list1_counter) <= list2.get(list2_counter))
                resultList.add(list1.get(list1_counter++));
            else resultList.add(list2.get(list2_counter++));
        }
        return resultList;
    }
}


