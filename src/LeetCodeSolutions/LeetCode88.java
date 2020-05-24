package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode88 {
	/**
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 System.arraycopy(nums2, 0, nums1, m, n);
		 Arrays.sort(nums1);
	 }
}
