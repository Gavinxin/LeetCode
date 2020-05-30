package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {
	/**
	 * 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
		if(head==null) return true;
		List<Integer> list = new ArrayList<>();
		while(head!=null) {
			list.add(head.val);
			head = head.next;
		}
			
		int left = 0;
		int right = list.size()-1;
		while(left<right) {
			if(list.get(left).intValue()!=list.get(right).intValue())
				return false;
			left++;
			right--;
		}
		return true;

    }
}
