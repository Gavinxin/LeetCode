package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode42 {
	/**
	 * 连续子数组的最大和
	 * @param board
	 * @param word
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		if(nums.length==0) return 0;
		int[] dp =new int[nums.length];
		dp[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(dp[i-1]>0)
				dp[i] =dp[i-1] + nums[i];
			else
				dp[i] = nums[i];
		}
		return Arrays.stream(dp).max().getAsInt();
     }
}
