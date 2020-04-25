package GetOfferSolutions;

import LeetCodeSolution.ListNode;

public class Offer52 {
	/**
	 * 面试题52. 两个链表的第一个公共节点
	 * @param headA
	 * @param headB
	 * @return
	 */
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	       ListNode p = headA;
	       ListNode q = headB;
	       while(p!=q) {
	    	   p = p == null? p=headB :p.next;
	    	   q = q == null? q=headA :q.next;
	       }
	       return p;
	 }
}
