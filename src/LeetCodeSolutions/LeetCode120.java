package LeetCodeSolutions;

import java.util.List;

public class LeetCode120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int size = triangle.size();
		if(size==0 || triangle ==null)
			return 0;
		int[][] dp =new int[size][size];
		for (int j = 0; j < triangle.get(size-1).size(); j++) {
			dp[size-1][j] = triangle.get(size-1).get(j);
		}
		int i =triangle.size()-2;
		for (; i >=0; i--) {
			for (int j = 0; j < triangle.get(i).size(); j++) {
				dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1])+triangle.get(i).get(j);
			}
		}
		
		return dp[0][0];		
		
    }
	
	
}
