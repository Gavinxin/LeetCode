package LeetCodeSolutions;

public class LeetCode34 {
	/**
	 * 34. 在排序数组中查找元素的第一个和最后一个位置
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] searchRange(int[] nums, int target) {
		if(nums.length == 0){
			return new int[] {-1,-1};
		}
		 if(nums.length == 1 && nums[0] == target){
				return new int[] {0,0};
			}
		int l = 0, r = nums.length-1;
		int mid = -1;
		while(l<r) {
			mid = l+(r-l)/2;
			if(nums[mid] == target)
				break;
			else if(nums[mid] > target)
				r = mid-1;
			else l = mid+1;
		}
		if(l>=r){
			return new int[] {-1,-1};
		}
		else
		{
			l = mid;
			while(l-1>=0&&nums[l-1] == target)
				l--;
			r = mid;
			while(r+1<nums.length&&nums[r+1] == target)
				r++;
		}
		return new int[] {l,r};
    }
}
