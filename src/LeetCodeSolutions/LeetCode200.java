package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode200 {
	/**
	 * 200. 岛屿数量 给你�?个由 '1'（陆地）�? '0'（水）组成的的二维网格，请你计算网格中岛屿的数量�?
岛屿总是被水包围，并且每座岛屿只能由水平方向�?/或竖直方向上相邻的陆地连接形�?
此外，你可以假设该网格的四条边均被水包围�?
	 * @param grid
	 * @return
	 */
	public int numIslands(char[][] grid) {
		int num= 0;
		if(grid.length == 0) return num;
		int[][] visited =new int[grid.length][grid[0].length];
		for (int i = 0; i < visited.length; i++) {
			Arrays.fill(visited[i], -1);
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(visited[i][j]!=1 && grid[i][j]==1 ) {
					num++;
					dfs(grid,visited,i,j);
					
				}
			}
		}
		return num;
    }

	private void dfs(char[][] grid, int[][] visited, int i, int j) {
		visited[i][j] =1;
		//System.out.println(i+" "+j);
		if(i-1>=0 &&grid[i-1][j]==1 &&visited[i-1][j]!=1)
			dfs(grid,visited,i-1,j);
		if(j-1>=0 &&grid[i][j-1]==1&&visited[i][j-1]!=1)
			dfs(grid,visited,i,j-1);
		if(i+1<grid.length &&grid[i+1][j]==1&&visited[i+1][j]!=1)
			dfs(grid,visited,i+1,j);
		if(j+1<grid[0].length &&grid[i][j+1]==1&&visited[i][j+1]!=1)
			dfs(grid,visited,i,j+1);
		
	}
	public static void main(String[] args) {
		LeetCode200 l = new LeetCode200();
		System.out.println(l.numIslands(new char[][] {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}}));
	}
	
}
