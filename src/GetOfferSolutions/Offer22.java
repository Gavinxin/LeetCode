package GetOfferSolutions;

import LeetCodeSolution.ListNode;

public class Offer22 {
	/**
	 * �����е�����k���ڵ�
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode p =  head,q =head;
		for (int i = 0; i < k; i++) {
			q= q.next;
		}
		while(q!=null) {
			p = p.next;
			q = q.next;
		}
		return p;
    }
}
