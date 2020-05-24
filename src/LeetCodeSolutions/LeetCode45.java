package LeetCodeSolutions;

public class LeetCode45 {
	/**
	 * 45. 跳跃游戏 II
	 * 在遍历数组时，我们不访问最后一个元素，
	 * 这是因为在访问最后一个元素之前，
	 * 我们的边界一定大于等于最后一个位置，
	 * 否则就无法跳到最后一个位置了。如果访问最后一个元素，
	 * 在边界正好为最后一个位置的情况下，
	 * 我们会增加一次「不必要的跳跃次数」，因此我们不必访问最后一个元素。
	 * @param nums
	 * @return
	 */
	 public int jump(int[] nums) {
		 if(nums.length == 0)
			 return 0;
		 if(nums.length == 1)
			 return 1;
		 int maxPos = 0;
		 int step = 0;
		 int end = 0;
		 for (int i = 0; i < nums.length-1; i++) {
			maxPos = Math.max(maxPos, nums[i]+i);
			if(i==end) {
				end = maxPos;
				step++;
			}
		 }
		return step;
	 }
}
