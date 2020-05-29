package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode198 {
	/**
	 * ´ò¼Ò½ÙÉá
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		 int len = nums.length;
		 int[] dp = new int[len+1];
		 if(len == 0) return 0;
		 if(len == 1) return nums[0];
		 dp[0] = nums[0];
        dp[1] = nums[0]>=nums[1]?nums[0]:nums[1];
		 for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		 return dp[len-1];
	 }
}
