package _2_augest.easy_questions;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-compare
public class StringCompare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i=1; i<=s.length()-k; i++){
            String subStr = s.substring(i, i + k);
            if(smallest.compareTo(subStr)>0)
                smallest = subStr;
            if(largest.compareTo(subStr)<0)
                largest = subStr;
        }

        return smallest + "\n" + largest;
    }
}
