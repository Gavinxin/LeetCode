package GetOfferSolutions;

import LeetCodeSolution.ListNode;

public class Offer25 {
	/**
	 * 面试题25. 合并两个排序的链表
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {   
        if(l1==null)
			return l2;
		if(l2 == null)
			return l1;
		ListNode dummy = new ListNode(0);
		ListNode p  = dummy;
		while(l1!=null && l2!=null) {
			if(l1.val<=l2.val)
				{
					p.next = l1;
					p = p.next;
					l1 = l1.next;
				}else {
					p.next = l2;
					p = p.next;
					l2 = l2.next;
				}
		}
		if(l1!=null)
			p.next = l1;
		if(l2!=null)
			p.next = l2;
		return dummy.next;
    }
}
