package GetOfferSolutions;

public class Offer53 {
	/**
	 * ������53 - II. 0��n-1��ȱʧ������
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {
		int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + ((high - low) >> 1);
            if(nums[mid] != mid){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return nums[low] == low ? nums[low]+1 : nums[low]-1;

    }
}
