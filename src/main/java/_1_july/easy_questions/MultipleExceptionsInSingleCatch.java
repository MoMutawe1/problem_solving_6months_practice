package _1_july.easy_questions;

// How do you illustrate multiple exceptions in a single catch block in Java?
public class MultipleExceptionsInSingleCatch {

    public static void main(String[] args) {
        int x=5, y=0;
        division(x, y);
    }

    private static int division(int x, int y) {
        try {
            return x/y;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("..illustrate multiple exceptions in a single catch block..");
        }
        return x/y;
    }
}
