package LeetCodeSolutions;

public class LeetCode1143 {
	/**
	 * @param s
	 * @return
	 */
	public static void main(String[] args) {
		LeetCode1143 l =new LeetCode1143();
		System.out.println(l.longestCommonSubsequence("abc", "bca"));
	}
	public int longestCommonSubsequence(String text1, String text2) {
		if(text1==null || text2 ==null)
			return 0;
		int l1  =text1.length();
		int l2 = text2.length();
		int[][] dp =new int[l1+1][l2+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 0;
		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] =0;
		}
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {
				if(text1.charAt(i-1) == text2.charAt(j-1))
					dp[i][j] =dp[i-1][j-1]+1;
				else
				    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
		return dp[l1][l2];
    }
}
