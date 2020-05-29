package LeetCodeSolutions;

public class LeetCode142 {
	/**
	 * 142. ª∑–Œ¡¥±Ì II
	 * @param head
	 * @return
	 */
	public ListNode detectCycle(ListNode head) {
		if(head == null) return null;
		ListNode p= head,q=head;
		while(true) {
			if(q == null || q.next == null)
				return null;
			p = p.next;
			q = q.next.next;			
			if(p == q)
				break;
		}
		p = head;
		while(p!=q) {
			p =p.next;
			q=q.next;
		}
		return p;
    }
}
