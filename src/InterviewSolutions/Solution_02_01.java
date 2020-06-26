package InterviewSolutions;
import java.util.HashMap;
import java.util.HashSet;

import LeetCodeSolutions.ListNode;

public class Solution_02_01 {
	/**
	 * 
	 * @param head
	 * @return
	 */
	public ListNode removeDuplicateNodes(ListNode head) {
		if(head == null)
			return null;
		HashSet<Integer> set =new HashSet<>();
		ListNode p = head;
		set.add(head.val);
		while(p!=null&&p.next!=null) {
			if(set.contains(p.next.val)) {
				p.next = p.next.next;
			}else {
				set.add(p.next.val);
				p = p.next;
			}
		}
		return head;
    }
}
