package _1_july.easy_questions;

// question description: https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println("First Approach: " + climbStairs1( 10));
        System.out.println("Second Approach: " + climbStairs2(10));
        System.out.println("Climb Stairs Recursively: " + climbStairsRecursively(10));
    }

    // time complexity O(n)
    public static int climbStairs1(int n) {
        int[] step = new int[n+1];
        step[0] = 1;
        step[1] = 1;

        for(int x=2; x<=n; x++){
            step[x] = step[x-1] + step[x-2];
        }
        return step[n];
    }

    // time complexity O(n)
    public static int climbStairs2(int n) {
        int firstStep = 0;
        int secondStep = 1;
        int finalStep = 0;

        int counter = 0;
        while(counter < n){
            finalStep = firstStep + secondStep;

            firstStep = secondStep;
            secondStep = finalStep;
            counter++;
        }
        return finalStep;
    }

    // time complexity O(2^n)
    public static int climbStairsRecursively(int n) {
        if(n==0 || n==1) return 1;

        return climbStairsRecursively(n-1) + climbStairsRecursively(n-2);
    }
}
