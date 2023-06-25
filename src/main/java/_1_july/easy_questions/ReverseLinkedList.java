package _1_july.easy_questions;

import java.util.LinkedList;

// question description: https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(reverseList(linkedList));
    }

    public static LinkedList reverseList(LinkedList head) {
        LinkedList<Object> result = new LinkedList();
        for (int i = head.size()-1; i >= 0; i--) {
            result.add(head.get(i));
        }
        return result;
    }
}
