package LeetCodeSolutions;

public class LeetCode1295 {
	/**
	 * 1295. 统计位数为偶数的数字
	 * @param nums
	 * @return
	 */
	public int findNumbers(int[] nums) {
		int res =0;
		for (int i = 0; i < nums.length; i++) {
			int len  = 1;
			while(nums[i]/10!=0) {
				nums[i] = nums[i]/10;
				len++;
			}
			if(len%2==0)
				res++;
		}
		return res;
		
    }
}
