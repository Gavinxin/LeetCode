package GetOfferSolutions;

public class Offer42 {
	public int maxSubArray(int[] nums) {
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum >= 0 ? sum + nums[i] : nums[i];
			maxsum = Math.max(sum, maxsum);
		}
		return maxsum;
	}
}
