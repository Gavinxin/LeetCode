package LeetCodeSolutions;

public class LeetCode72 {
	/**
	 * Edit distance
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance(String word1, String word2) {
		if(word1.length()==0)
	        return word2.length();
		else if(word2.length() == 0)
			return word1.length();
		else if(word1.equals(word2))
			return 0;
		int length1= word1.length();
		int length2= word2.length();
		int dp[][] = new int[length1+1][length2+1];
		for (int i = 0; i <length1+1; i++) {
			dp[i][0] = i;
		}
		for (int i = 0; i<length2+1; i++) {
			dp[0][i] =i;
		}
		for (int i = 1; i < length1+1; i++) {
			for (int j = 1; j < length2+1; j++) {
				int min_temp = Math.min(dp[i-1][j], dp[i][j-1]);
				int last = dp[i-1][j-1];
				if(word1.charAt(i-1)!=word2.charAt(j-1))
					last +=1;
				dp[i][j] =Math.min(min_temp+1, last);
			}
		}
		return dp[length1][length2];
    }
}
