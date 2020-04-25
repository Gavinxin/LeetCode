package GetOfferSolutions;

import LeetCodeSolution.ListNode;

public class Offer24 {
	/**
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		if(head == null)
            return null;
		ListNode dummy = new ListNode(0);
		ListNode p =head.next;
		dummy.next = head;
		while(p!=null) {
			head.next = p.next;
			dummy.next = p;
			p.next = dummy.next;
			p=head;
			p = head.next;
		}
		return dummy.next;
    }
}
