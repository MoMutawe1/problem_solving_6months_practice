package _1_july.easy_questions;

// 12. How can you find the factorial of an integer in Java?
public class FindFactorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}