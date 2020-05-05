package GetOfferSolutions;

public class Offer21 {
	/**
	 * 
	 * @param nums
	 * @return
	 */
	public int[] exchange(int[] nums) {
		if(nums.length == 0 || nums.length ==1)
			return nums;
		int left = 0;
		int right = nums.length-1;
		while(left<right) {
			while(nums[left]%2!=0&&left<right)
				left++;
			while(nums[right]%2==0&&right>left)
				right--;
			if(left<right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
			
		}
		return nums;
    }
}
