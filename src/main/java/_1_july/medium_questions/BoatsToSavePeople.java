package _1_july.medium_questions;

import java.util.Arrays;

// question description: https://leetcode.com/problems/boats-to-save-people/
public class BoatsToSavePeople {

    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;

        System.out.println(numRescueBoats(people, limit));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int startPos = 0, endPos = people.length-1, numOfBoats = 0;
        Arrays.sort(people);

        while (startPos <= endPos){
            if(people[startPos] + people[endPos] <= limit) startPos++;
            endPos--;
            numOfBoats++;
        }
        return numOfBoats;
    }
}
