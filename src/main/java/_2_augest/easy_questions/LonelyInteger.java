package _2_augest.easy_questions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
        lonelyinteger(list);
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: a)
            hm.put(i, hm.getOrDefault(i, 0)+1);

        for(int i: a)
            if(hm.get(i) == 1)
                return i;
        return 0;
    }
}
