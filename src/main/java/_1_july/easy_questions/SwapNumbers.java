package _1_july.easy_questions;

// How do you swap two numbers without using a third variable in Java?
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNums(a, b);
    }

    public static void swapNums(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(" First Num: " + num1 + " ,Second Num: " + num2);
    }
}
