package _2_augest.easy_questions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem
public class PlusMinus {

    public static void main(String[] args) throws IOException {

        List<Integer> customList = Arrays.asList(4, 7, 0, -3, -9);
        plusMinus(customList);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        if(size == 0) return;

        float positive = 0, negative = 0, zero = 0;

        for(int i: arr){
            if(i<0) negative++;
            else if(i>0) positive++;
            else zero++;
        }

        System.out.println(positive/size);
        System.out.println(negative/size);
        System.out.println(zero/size);
    }
}
