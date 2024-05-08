package org.graph.lucky.bhaiyan;

public class PerimeterOfIslands {
	//TC: O(V + E)
	//SC: O(m*n) + O(v) stack space in case of all lands are connected in all four direction
	int count = 0;
    private void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        //base case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || 
           grid[i][j] == 0) 
        {  
            count++;
            return;
        }
        
        if(visited[i][j]) {
            return;   
        }
        visited[i][j] = true;
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i, j+1);
        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i, j-1);
    }
    
    public int islandPerimeter(int[][] grid) {
        count = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1 && visited[i][j] == false) {
                    dfs(grid, visited, i, j);
                    //traverse only one island
                    break;
                }
            }
        }
        return count;
    }
}
