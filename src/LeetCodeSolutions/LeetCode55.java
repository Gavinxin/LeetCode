package LeetCodeSolutions;

public class LeetCode55 {
	/**
	 *  跳跃游戏
	 *  给定一个非负整数数组，你最初位于数组的第一个位置。
		数组中的每个元素代表你在该位置可以跳跃的最大长度。
		判断你是否能够到达最后一个位置。
	 * @param nums
	 * @return
	 */
	public boolean canJump(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
        	return true;
        int dp[] = new int[nums.length];
        dp[0] =nums[0];
        for (int i = 1; i < nums.length; i++) {
			if(i<=dp[i-1]) 
				dp[i] = Math.max(dp[i-1], i + nums[i]);
			if(dp[i]>=nums.length-1)
				return true;
		}
        return false;
    }
}
