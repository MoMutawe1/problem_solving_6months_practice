package _1_july.medium_questions;

// question description: https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}
                };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {

        int numberOfIslands = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    numberOfIslands +=1;
                    callBFS(grid, i, j);
                }
            }
        }
        return numberOfIslands;
    }

    public static void callBFS(char[][] grid, int i, int j){
        if(i<0 || i>= grid.length || j<0 || j>= grid[i].length || grid[i][j]=='0') return;

        grid[i][j] = '0';
        callBFS(grid, i+1, j); // up
        callBFS(grid, i-1, j); // down
        callBFS(grid, i, j+1); // right
        callBFS(grid, i, j-1); // left
    }
}
