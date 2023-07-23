package _1_july.easy_questions;

// print a Pyramid of stars
public class PyramidOfStars {

    public static void main(String[] args) {
        int numOfRows = 10;
        buildPyramid(numOfRows);
    }

    private static void buildPyramid(int numOfRows) {

        for (int i = 0; i <= numOfRows; i++) {
            int numOfSpaces = numOfRows - i;
            for (int j = 0; j < numOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
