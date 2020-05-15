package GetOfferSolutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Offer61 {
	/**
	 * ������61. �˿����е�˳��
	 * @param nums
	 * @return
	 */
	public boolean isStraight(int[] nums) {
		Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) continue;
			if(repeat.contains(nums[i])) return false;
			repeat.add(nums[i]);
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
		}
        return max-min<=4;
    }
}
