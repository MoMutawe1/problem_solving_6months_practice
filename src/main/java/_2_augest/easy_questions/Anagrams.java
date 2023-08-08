package _2_augest.easy_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

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
        if(a.length() != b.length()) return false;

        // Complete the function
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(char c: a.toCharArray())
            hm1.put(c, hm1.getOrDefault(c, 0)+1);

        for(char c: b.toCharArray())
            hm2.put(c, hm2.getOrDefault(c, 0)+1);

        for(Map.Entry<Character, Integer> e: hm1.entrySet()) {
            if(hm1.get(e.getValue()) != hm2.get(e.getValue())) return false;
        }
        return true;
    }
}
