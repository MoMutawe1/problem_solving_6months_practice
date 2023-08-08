package _2_augest.easy_questions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagEasyWay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String a = scan.next();
        System.out.print("Enter the second word: ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(!Arrays.toString(arr1).equals(Arrays.toString(arr2))) return false;

        return true;
    }
}
