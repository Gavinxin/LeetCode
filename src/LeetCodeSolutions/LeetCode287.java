package LeetCodeSolutions;

public class LeetCode287 {
	/**
	 * 
	 * @param nums
	 * @return
	 */
	/**
	 * (1) 根据数组元素个数以及数值范围的确定，可以使用二分查找在数值范围内遍历重复数。
(2) 简单说就是对应一个范围内数值 m ，如果小于等于 m 的元素个数大于 m ，则表示 1 到 m 区间有重复数值。
(3) 反过来考虑，如果小于等于 m 的元素个数小于等于 m ，则大于 m 的数值区间一定有重复，否则在限制长度的情况下最大值会超出 n - 1 。
(4) 使用二分查找遍历找到最终的 m 值返回。
	 * @param nums
	 * @return
	 */
	public int findDuplicate(int[] nums) {
		int len = nums.length;
		int left = 0,right =len-1,res = -1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			int count = 0;
			for (int i = 0; i <= len; i++) {				
				if(nums[i]<=mid)
					count++;
			}
			if(count>mid) {
				right = mid-1;
				res = mid;
			}
				
			else left = mid+1;
		}
		return res;
    }
	public int findDuplicate1(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				if(nums[i]==nums[j])
					return nums[i];
			}
		}
		return 0;
    }
}
