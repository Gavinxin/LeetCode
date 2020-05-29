package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode300 {
	/**
	 * 300. 最长上升子序列
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS(int[] nums) {
		int len =nums.length;
		int[] dp = new int[len];
		Arrays.fill(dp, 0);
		dp[0] = 1;
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if(nums[i]>nums[j])
					dp[i] = Math.max(dp[i], dp[j]+1);
			}
			max = Math.max(max, dp[i]);
		}
		return max;
    }
}
