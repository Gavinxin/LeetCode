package GetOfferSolutions;

import java.util.HashMap;

public class Offer57 {
	/**
	 * 面试题57. 和为s的两个数字
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		if(nums.length<2)
			return new int[] {};
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i]))
				return new int[] {nums[i],target-nums[i]};
			else map.put(nums[i], 1);
		}
		return new int[] {};
    }
}
