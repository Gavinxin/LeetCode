package Ali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quanpailie {
	/*
	 * È«ÅÅÁĞ
	 */

	public void quanpailie(int[] nums) {
		List<Integer> list = new ArrayList<>();
		backtrack(nums,list);
	}

	private void backtrack(int[] nums, List<Integer> list) {
		if(list.size() ==  nums.length) {
			list.forEach(System.out::print);
			System.out.println();
			return;
			
		}
		for (int i = 0; i < nums.length; i++) {
			if(!list.contains(nums[i])) {
				list.add(nums[i]);
				backtrack(nums,list);
				list.remove(list.size()-1);
			}
		}	
		
	}
	public static void main(String[] args) {
		Quanpailie q = new Quanpailie();
		q.quanpailie(new int[] {1,2,3});
	}
	
}
