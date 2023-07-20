package _1_july.easy_questions;

// How do you check whether a string is a palindrome in Java?
public class PalindromeString {
    public static void main(String[] args) {
        String str = "race car  ";
        System.out.println(palindromeCheck(str));
    }


    private static boolean palindromeCheck(String str) {
        int pointer1 = 0, pointer2 = str.length()-1;

        while (pointer1 < pointer2){
            while(str.charAt(pointer1) == ' ') pointer1++;
            while (str.charAt(pointer2) == ' ') pointer2--;

            if(str.charAt(pointer1) != str.charAt(pointer2))
                return false;
            pointer1++;
            pointer2--;
        }
        return true;
    }
}
