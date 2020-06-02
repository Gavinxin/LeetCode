package LeetCodeSolutions;

public class LeetCode206 {
	/**
	 * ·´×ªÁ´±í
	 * @param head
	 * @return
	 */
	 public ListNode reverseList(ListNode head) {
		 ListNode dummy= new ListNode(0);
		 dummy.next = head;
		 if(head == null)
			 return head;
		 while(head!=null) {
			 ListNode p =head.next;
			 head.next = p.next;
			 p.next =dummy.next;
			 dummy.next = p;
		 }
		 return dummy.next;
	 }
}
