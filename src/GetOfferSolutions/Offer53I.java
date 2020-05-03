package GetOfferSolutions;

public class Offer53I {
	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		int cnt =0;
		for (int i = 0; i < nums.length; i++) {
			if(target == nums[i])
				cnt++;
		}
		return cnt;
    }
}
