package LeetCodeSolution;

import java.util.Arrays;

public class LeetCode198 {
	/**
	 * ¥Úº“ΩŸ…·
	 * @param nums
	 * @return
	 */
	 public int rob(int[] nums) {
		 int[] dp = new int[nums.length];
		 if(nums.length == 0)
			 return 0;
		 if(nums.length == 1)
			 return nums[0];
		 if(nums.length == 2)
			 return Math.max(nums[0],nums[1]);
		 dp[0] = nums[0];
		 dp[1] = Math.max(nums[0],nums[1]);
		 for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
		}
		 return dp[dp.length-1];
	 }
}
