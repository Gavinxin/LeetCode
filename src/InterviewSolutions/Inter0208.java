package InterviewSolutions;

import LeetCodeSolution.ListNode;

public class Inter0208 {
	/**
	 * 面试题 02.08. 环路检测
	 * 给定一个有环链表，实现一个算法返回环路的开头节点。
有环链表的定义：在链表中某个节点的next元素指向在它前面出现过的节点，则表明该链表存在环路。
	 * @param head
	 * @return
	 */
	 public ListNode detectCycle(ListNode head) {
		 	if(head == null || head.next ==null)
		 		return null;
	        ListNode p = head, q =head;
	        while(q!=null &&q.next!=null) {
	        	p = p.next;
	        	q =q.next.next;
	        	if(p ==q) break;
	        }
	        if(q == null || q.next == null)
	        	return null;
	        p = head;
	        while(p!=q) {
	        	p = p.next;
	        	q=q.next;
	        }
	        return p;
	 }
}
