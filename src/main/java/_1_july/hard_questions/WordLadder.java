package _1_july.hard_questions;


import java.util.*;

// question description: https://leetcode.com/problems/word-ladder/
public class WordLadder {

    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");

        System.out.println(ladderLength(beginWord, endWord, wordList));
    }

    // DFS
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet(wordList);
        Queue<String> queue = new LinkedList();
        Set<String> visited = new HashSet();    // to prevent infinite loop

        // adding the initial word to the queue then mark it as visited
        queue.add(beginWord);
        visited.add(beginWord);

        int level = 0;
        while (!queue.isEmpty()) {
            for (int size = queue.size(); size > 0; size--) {

                String word = queue.poll();
                if (word.equals(endWord))
                    return level + 1;
                char[] ch = word.toCharArray();
                for (int i = 0; i < ch.length; i++) {

                    char backup = ch[i];
                    for (char c = 'a'; c <= 'z'; c++) {

                        ch[i] = c;
                        String nextWord = String.valueOf(ch);
                        if (!visited.contains(nextWord) && wordSet.contains(nextWord)) {
                            queue.add(nextWord);
                            visited.add(nextWord);
                        }
                    }
                    ch[i] = backup;
                }
            }
            level++;
        }
        return 0;
    }
}
