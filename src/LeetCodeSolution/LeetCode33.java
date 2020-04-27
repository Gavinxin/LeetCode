package LeetCodeSolution;

public class LeetCode33 {
	/**
	 * 33. ËÑË÷Ğı×ªÅÅĞòÊı×é
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		if(nums.length == 0)
            return -1;
		int c = searchTarget(nums, 0, nums.length - 1, target);
		return c;
	}

	private int searchTarget(int[] nums, int left, int right, int target) {
		// TODO Auto-generated method stub
		int mid = left + (right - left) / 2;
		if(right > left) 
			return -1;
		if (nums[mid] == target)
			return mid;
		if (nums[0] <= nums[mid]) {
            if (nums[0] <= target && target < nums[mid]) {
                return searchTarget(nums, left, mid - 1, target);
            } else {
            	return searchTarget(nums, mid+1, right, target);
            }
        } else {
            if (nums[mid] < target && target <= nums[nums.length - 1]) {
            	return searchTarget(nums, mid+1, right, target);
            } else {
            	return searchTarget(nums, left, mid - 1, target);
            }
        }
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 9,0,2,7,8 };
		LeetCode33 l = new LeetCode33();
		System.out.println(l.search(nums, 3));
	}
}
