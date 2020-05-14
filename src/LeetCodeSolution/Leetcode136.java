package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class Leetcode136 {
	/**
	 * 136. 只出现一次的数字
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(list.contains(nums[i]+""))
				list.remove(nums[i]+"");
			else list.add(nums[i]+"");
		}
		return Integer.valueOf(list.get(0));
    }
}
