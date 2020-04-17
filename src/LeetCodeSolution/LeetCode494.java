package LeetCodeSolution;

public class LeetCode494 {
	/**
	 * 目标和
	 * 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或 -中选择一个符号添加在前面。
	 * 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
	 * @param nums
	 * @param S
	 * @return
	 */
	int sum =0;
	public int findTargetSumWays(int[] nums, int S) {
		findTarget(nums,0,S,0);
		return sum;
    }
	private void findTarget(int[] nums, int curSum,int s ,int i ) {
		if(i == nums.length && s == curSum)
			sum++;
		if(i<nums.length) {
			findTarget(nums,curSum+nums[i],s,i+1);
			findTarget(nums,curSum+nums[i],s,i+1);
		}
		
		
	}
}
