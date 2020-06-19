package LeetCodeSolutions;

public class LeetCode1480 {
	/**
	 * 1480. 一维数组的动态和
	 * @param nums
	 * @return
	 */
	public int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i-1]+nums[i];
		}
		return nums;
    }
}
