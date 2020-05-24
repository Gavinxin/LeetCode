package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode347 {
	/**
	 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
	 * @param nums
	 * @param k
	 * @return
	 */
	public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer,Integer> map =new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		PriorityQueue<Integer> stack = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
		for (Integer integer : map.keySet()) {
			stack.add(integer);
			if(stack.size()>k)
				stack.poll();
		}
		List<Integer> list =new ArrayList<>();
		for (Integer integer : stack) {
			list.add(integer);
		}
		return list;
    }
}
