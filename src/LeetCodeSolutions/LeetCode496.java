package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode496 {
	/**
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] res = new int[nums1.length];
		Stack<Integer> stack = new Stack<>();
        HashMap < Integer, Integer > map = new HashMap < > ();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek())
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }
        while (!stack.empty())
            map.put(stack.pop(), -1);
        for (int i = 0; i < res.length; i++) {
			res[i] = map.get(nums1[i]);
		}
		return res;

    }
}
