package GetOfferSolutions;

import LeetCodeSolution.ListNode;

public class Offer18 {
	/**
	 * ������18. ɾ������Ľڵ�
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode deleteNode(ListNode head, int val) {
		if(head == null)
			return null;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre= dummy;
		while(head.val!=val&&head!=null) {
			head= head.next;
			pre = pre.next;
		}
		pre.next = head.next;
		return dummy.next;
    }
	
}
