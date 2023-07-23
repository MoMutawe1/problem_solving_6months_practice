package _1_july.easy_questions;

public class PyramidOfNumbers {

    public static void main(String[] args) {
        int numOfRows = 10;
        buildPyramid(numOfRows);
    }

    private static void buildPyramid(int numOfRows) {

        for (int i = 1; i <= numOfRows ; i++) {
            int numOfSpaces = numOfRows-1;

            for (int j = numOfSpaces*2-1; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = i-1; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
