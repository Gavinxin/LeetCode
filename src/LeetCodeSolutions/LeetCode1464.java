package LeetCodeSolutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LeetCode1464 {
	/**
	 * 1464. ��������Ԫ�ص����˻�
	 * @param nums
	 * @return
	 */
	public int maxProduct(int[] nums) {
		nums = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::valueOf).toArray();
		return (nums[0]-1)*(nums[1]-1);
    }
}
