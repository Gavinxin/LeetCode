package LeetCodeSolutions;

public class LeetCode83 {
	/**
	 * 83. 删除排序链表中的重复元素
	 * @param head
	 * @return
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null)
			return null;
		ListNode node = head;
		while(node.next!=null) {
			if(node.val == node.next.val)
				node.next = node.next.next;
			else node = node.next;
		}
		return head;
    }
}
