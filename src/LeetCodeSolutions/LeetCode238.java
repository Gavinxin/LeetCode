package LeetCodeSolutions;

public class LeetCode238 {
	/**
	 * 238. 除自身以外数组的乘积
	 * @param nums
	 * @return
	 */
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] left = new int[len];
		int[] right = new int[len];
		int[] res = new int[len];
		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1]*nums[i-1];		
		}
		right[len-1] = 1;
		for (int i = len-2; i >=0; i--) {
			right[i] = right[i+1]*nums[i+1];			
		}
		for (int i = 0; i < res.length; i++) {
			res[i] = left[i]*right[i];
		}
		return res;
    }
}
