package _2_augest.easy_questions;

import java.util.*;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem
public class CountingSort {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25,
                81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59,
                10, 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68,
                78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46, 44,
                9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33);
        System.out.println(countingSort(arr));
    }

    // HashMap Solution
    public static List<Integer> countingSort(List<Integer> arr) {

        //creates HashMap with 100 elements
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i=0; i< arr.size(); i++) {
            if(arr.contains(i))
                hm.put(arr.get(i), hm.getOrDefault(arr.get(i), 0) + 1);
            else hm.put(i, 0);
        }

        for(int i=0; i< arr.size(); i++){
            if(hm.get(i) != null)
            resultList.add(hm.get(i));
        }
        return resultList;
    }

/*    public static List<Integer> countingSort(List<Integer> arr) {

        //creates resultList with 100 elements filled with zeros
        List<Integer> resultList = new ArrayList<Integer>(Collections.nCopies(100, 0));

        for(Integer i : arr)
            resultList.set(i, resultList.get(i)+1);
        return resultList;
    }*/
}
