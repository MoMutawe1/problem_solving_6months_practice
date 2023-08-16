package _2_augest.easy_questions;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem
public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> customList = Arrays.asList(1, 3, 5, 7, 9);
        miniMaxSum(customList);
    }

    public static void miniMaxSum(List<Integer> arr) {

        // Write your code here
        long min = Long.MAX_VALUE, max = 0;
        long miniSum = 0, maxiSum = 0;

        if(arr.size() == 0) return;

        for(int i: arr){
            if(i < min)
                min = i;
            if(i > max)
                max = i;
            maxiSum += i;
            miniSum += i;
        }

        miniSum = miniSum - max;
        maxiSum = maxiSum - min;
        System.out.println(miniSum + " " + maxiSum);
    }
}
