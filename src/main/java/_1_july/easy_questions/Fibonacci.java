package _1_july.easy_questions;

// question description:
public class Fibonacci {

    public static void main(String[] args) {
        int limitNum = 30;
        printFibonacciSeries(limitNum);
    }

    // 0 1 1 2 3 5 8 13 21 34
    public static void printFibonacciSeries(int goal){
        int firstNum=0;
        int secNum=1;
        int finalNum = 0;

        System.out.println(firstNum);
        System.out.println(secNum);

        while(finalNum < goal) {
            finalNum = firstNum + secNum;
            firstNum = secNum;
            secNum = finalNum;
            System.out.println(finalNum);
        }
    }
}
