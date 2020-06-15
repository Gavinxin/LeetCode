package LeetCodeSolutions;

public class LeetCode283 {
	/**
	 * 
	 * @param nums
	 */
	public void moveZeroes(int[] nums) {
		 int i = 0;
		 while(i<nums.length) {
			 if(nums[i] == 0) {
				 int j = i+1;
				 while(j<nums.length&&nums[j]==0)
					 j++;
				 int temp = nums[i];
				 nums[i] = nums[j];
				 nums[j] = temp;					 
			 }
		 }
		 i++;
    }
}
