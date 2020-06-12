package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
	/**
	 * 三数之和
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length<3)
			return list;
		//排序
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			//如果当前数字大于0，则三数之和一定大于0，所以结束循环
			if(nums[i]>0) break;
			if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
			int l = i+1,r = len-1;
			while(l<r) {
				int sum = nums[i]+nums[l]+nums[r];
				if( sum == 0) {
					list.add(Arrays.asList(nums[i],nums[l],nums[r]));
					while (l<r && nums[l] == nums[l+1]) l++; // 去重
                    while (l<r && nums[r] == nums[r-1]) r--; // 去重
                    l++;
                    r--;
				}
				else if(sum <0)
					l++;
				else r--;
					
			}
		}
		return list;
    }
}
