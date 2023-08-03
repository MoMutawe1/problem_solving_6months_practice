package _2_augest.easy_questions;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops/
public class PowN {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            applySeries(a, b, n);
        }
        in.close();
    }

    // (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), … (a + 2^0 * b + 2^1 * b + … + 2^n-1 * b)
    public static void applySeries(int a, int b, int n){

        for(int i=0;i<n;i++){
            a += Math.pow(2, i)*b;
            System.out.print(a + " ");
        }
        System.out.println();
    }
}