package _1_july.easy_questions;

public class _WhiteClass {
    public static void main(String[] args) {
        printFibonacciSequence(10);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34..
    private static void printFibonacciSequence(int num) {
        int temp = 0, num1=0, num2=1;

        System.out.print(0 + " " + 1 + " ");
        for (int i = 0; i < num; i++) {

            System.out.print(num1 + num2 + " ");
            temp = num1;
            num1 = num2;
            num2 = temp + num2;
        }
    }
}
