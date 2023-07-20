package _1_july.easy_questions;

// Write a Java program to check if the given number is a prime number.

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }

    private static boolean isPrime(int num) {
        if(num == 2) return true;

        for (int i = 2; i < num; i++)
            return num%i == 0 ? false : true;

        return false;
    }
}
