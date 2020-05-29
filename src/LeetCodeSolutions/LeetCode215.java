package LeetCodeSolutions;

import java.util.PriorityQueue;

public class LeetCode215 {
	/**
	 * 215. 数组中的第K个最大元素
	 * @param nums
	 * @param k
	 * @return
	 */
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->n2-n1);
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
			if(pq.size()>k)
				pq.poll();
		}
		return pq.poll();
    }
}
