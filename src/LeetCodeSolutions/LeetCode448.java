package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {
	/**
	 * 448. 找到所有数组中消失的数字
	 * @param nums
	 * @return
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            nums[index] = -Math.abs(nums[index]);
			
		}
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) 
				res.add(i+1);
		}
		return res;
    }
	public static void main(String[] args) {
		int x = 2;
		x *=-1;
		System.out.println(x);
	}
}
