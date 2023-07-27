package _1_july.easy_questions;

// create a custom functional interface with lambda, and add static and default functions to it.

@FunctionalInterface
interface Calculator {
    int sum(int x, int y);
    default int subtraction(int x, int y) { return x - y; }
    default int division(int x, int y) { return x / y; }
    static int multiply(int x, int y) { return x * y; }
}

public class CustomFuncInterface {
    public static void main(String[] args) {

        Calculator withLambda = (x, y) -> {
            return x + y;
        };

        System.out.println("return the sum using lambda expression " + withLambda.sum(20, 10));
        System.out.println("default subtraction " + withLambda.subtraction(20, 10));
        System.out.println("default division " + withLambda.division(20, 10));
        System.out.println("static multiply " + Calculator.multiply(20, 10));
    }
}
