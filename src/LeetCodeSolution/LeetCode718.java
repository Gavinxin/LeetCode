package LeetCodeSolution;

public class LeetCode718 {
	/**
	 * 
	 * @param stones
	 * @return
	 */
	public int findLength(int[] A, int[] B) {
		if(A==null || B ==null)
			return 0;
		int l1  =A.length;
		int l2 = B.length;
		int[][] dp =new int[l1+1][l2+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] =0;
		}
		int max = 0;
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {
				if(A[i-1] == B[j-1]) {
					dp[i][j] =dp[i-1][j-1]+1;
					max = Math.max(max, dp[i][j]);
				}
					
				else
				    dp[i][j] = 0;
			}
		}
		return max;
    }
}
