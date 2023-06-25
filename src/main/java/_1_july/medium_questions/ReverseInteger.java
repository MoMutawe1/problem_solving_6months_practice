package _1_july.medium_questions;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(123));
    }

    public static int reverse(int x) {

        boolean isNegative = false;
        long result = 0;

        if(x<0){
            isNegative = true;
            x *= -1;
        }

        while(x>0){
            result = result*10 + x%10;
            x /= 10;
        }

        if (result > Integer.MAX_VALUE) return 0;

        return isNegative ? (int)result*-1 : (int)result;
    }
}
