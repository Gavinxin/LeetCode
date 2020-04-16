package InterviewSolutions;

import LeetCodeSolution.ListNode;

public class Inter0208 {
	/**
	 * ������ 02.08. ��·���
	 * ����һ���л�����ʵ��һ���㷨���ػ�·�Ŀ�ͷ�ڵ㡣
�л�����Ķ��壺��������ĳ���ڵ��nextԪ��ָ������ǰ����ֹ��Ľڵ㣬�������������ڻ�·��
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
