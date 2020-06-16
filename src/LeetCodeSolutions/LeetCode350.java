package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode350 {
	/**
	 * 350. 两个数组的交集 II
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> res= new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if(list1.contains(nums2[i])) {
				res.add(nums2[i]);
				list1.remove(new Integer(nums2[i]));
			}
		}
		return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
