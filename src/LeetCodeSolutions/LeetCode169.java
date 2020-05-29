package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode169 {
	/**
	 * 169. ¶àÊıÔªËØ
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
    }
}
