package LeetCodeSolutions;

public class AddTwoNumbers {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ln = new ListNode(0);
		ListNode p = l1,q=l2,res=ln;
		int nextadd = 0;
		while(p!=null || q!=null) {
			int x = p==null?0:p.val;
			int y = q==null?0:q.val;
			int temp = x+y+nextadd;
			nextadd = temp/10;
			ListNode next = new ListNode(temp%10);
			res.next = next;
			res= res.next;
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		if(nextadd!=0)
			res.next = new ListNode(nextadd);
		
		return ln.next;

    }
}
