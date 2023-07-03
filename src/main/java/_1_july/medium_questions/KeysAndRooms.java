package _1_july.medium_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// question description: https://leetcode.com/problems/keys-and-rooms/
public class KeysAndRooms {
    /*
    Input: rooms = [[1,3],[3,0,1],[2],[0]]
    Output: false

    Input: rooms = [[1],[2],[3],[]]
    Output: true
     */
    public static void main(String[] args) {
        List<List<Integer>> rooms = Arrays.asList(Arrays.asList(1,3),Arrays.asList(3,0,1),Arrays.asList(2),Arrays.asList(0));
        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.add(0);

        while (!keys.isEmpty()){
            int currentKey = keys.pop();
            for(int newKey: rooms.get(currentKey)){ // only getting the keys of the rooms that we visited
                if(!visited[newKey]) {   // make sure we don't back to same room again (infinite loop)
                    visited[newKey] = true;  // update the array
                    keys.add(newKey);   // update the stack
                }
            }
        }

        for(boolean wasVisited: visited)
            if(wasVisited!=true) return false;

        return true;
    }
}
