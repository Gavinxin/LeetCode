package LeetCodeSolutions;

public class LeetCode1480 {
	/**
	 * 1480. һά����Ķ�̬��
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
