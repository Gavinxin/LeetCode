package LeetCodeSolutions;

public class LeetCode160 {
	/**
	 * 160. œ‡Ωª¡¥±Ì
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null || headB==null) return null;
		ListNode pA = headA, pB = headB;
		while(pA!=pB) {
			pA = pA==null?headB:pA.next;
			pB = pB==null?headA:pB.next;
		}
		return pB;
	}
}
