package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode581 {
	/**
	 * 581. 最短无序连续子数组
	 * 
	 * @param nums
	 * @return
	 */
	public int findUnsortedSubarray(int[] nums) {
		if(nums.length == 1)
			return 0;
		int start = 0, end = 0;
		int[] copy = nums.clone();
		Arrays.sort(copy);
		boolean b = false;
		for (int i = 0; i < copy.length; i++) {
			if (nums[i] != copy[i]) {
				start = i;
				break;
			}
            if(i==copy.length-1)
                b = true;
		}
		if (start == 0&&nums[0]<=nums[1])
			return 0;
		for (int i = copy.length - 1; i >= 0; i--) {
			if (nums[i] != copy[i]) {
				end = i;
				break;
			}
		}
		System.out.println(start);
		System.out.println(end);
		return start>=end?nums.length:end - start + 1;
	}
	public static void main(String[] args) {
		LeetCode581 l = new LeetCode581();
		System.out.println(l.findUnsortedSubarray(new int[] {2,1}));
	}
}
