package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
	/**
	 * ����֮��
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(nums.length<3)
			return list;
		//����
		Arrays.sort(nums);
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			//�����ǰ���ִ���0��������֮��һ������0�����Խ���ѭ��
			if(nums[i]>0) break;
			if(i > 0 && nums[i] == nums[i-1]) continue; // ȥ��
			int l = i+1,r = len-1;
			while(l<r) {
				int sum = nums[i]+nums[l]+nums[r];
				if( sum == 0) {
					list.add(Arrays.asList(nums[i],nums[l],nums[r]));
					while (l<r && nums[l] == nums[l+1]) l++; // ȥ��
                    while (l<r && nums[r] == nums[r-1]) r--; // ȥ��
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
