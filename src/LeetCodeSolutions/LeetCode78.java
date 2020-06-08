package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LeetCode78 {
	/**
	 * 78. ×Ó¼¯
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<>());
		for (int i = 0; i < nums.length; i++) {
			 List<List<Integer>> newSubsets = new ArrayList();
		      for (List<Integer> curr : res) {
		    	  ArrayList<Integer> list = new ArrayList<>();
		    	  list.addAll(curr);
		    	  list.add(nums[i]);
		    	  newSubsets.add(list);
		      }
		      for (List<Integer> curr : newSubsets) {
		        res.add(curr);
		      }
			
		}
		return res;
    }

	
}
