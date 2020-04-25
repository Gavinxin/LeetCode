package GetOfferSolutions;

import LeetCodeSolution.ListNode;

public class Offer52 {
	/**
	 * ������52. ��������ĵ�һ�������ڵ�
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
