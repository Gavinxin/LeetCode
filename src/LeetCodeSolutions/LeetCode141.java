package LeetCodeSolutions;

public class LeetCode141 {
	/**
	 * 141. ª∑–Œ¡¥±Ì
	 * if has cycle
	 * @param head
	 * @return
	 */
	 public boolean hasCycle(ListNode head) {
		 if(head == null) return false;
			ListNode p= head,q=head;
			while(true) {
				if(q == null || q.next == null)
					return false;
				p = p.next;
				q = q.next.next;			
				if(p == q)
					return true;
			}
	    }
}
