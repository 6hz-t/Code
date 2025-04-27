package com.wit;

public class t200 {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid));
    }
    //DFS深度优先搜索
    public static int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length]; // 初始化访问数组
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (visited[i][j] == false && grid[i][j] == '1') {
                    dfs(grid, i, j, visited);
                    count++;
                }
            }

        }
        return count;

    }
    public static void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        if ((i - 1) > 0 && grid[i-1][j] == '1' && visited[i-1][j] == false)
            dfs(grid, i - 1, j, visited);

        if ((i + 1) < grid.length && grid[i+1][j] == '1' && visited[i+1][j] == false)
            dfs(grid, i + 1, j, visited);

        if ((j - 1) > 0 && grid[i][j-1] == '1' && visited[i][j-1] == false)
            dfs(grid, i, j - 1, visited);

        if ((j + 1) < grid[0].length && grid[i][j+1] == '1' && visited[i][j+1] == false)
            dfs(grid, i, j + 1, visited);
    }

    //BFS广度优先搜索

}



