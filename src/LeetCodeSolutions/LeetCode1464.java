package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode1464 {
	/**
	 * 1464. ��������Ԫ�ص����˻�
	 * @param nums
	 * @return
	 */
	public int maxProduct(int[] nums) {
		Arrays.sort(nums);
		return (nums[0]-1)*(nums[1]-1);
    }
}
