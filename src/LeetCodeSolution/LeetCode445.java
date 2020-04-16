package LeetCodeSolution;

import java.util.Stack;

public class LeetCode445 {
	public static void main(String[] args) {
		System.out.println(10%10);
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> s1 =new Stack<>();
				Stack<Integer> s2 =new Stack<>();
				while(l1!= null) {
					s1.add(l1.val);
					l1 =l1.next;
				}
				while(l2!= null) {
					s2.add(l2.val);
					l2 =l2.next;
				}
				ListNode dummy =new ListNode(0);
				ListNode p = dummy.next;
				int carry =0;
				while(s1!=null&&s1.size()>0&&s2!=null&&s2.size()>0) {
					int k1 =s1.pop();
					int k2 =s2.pop();
					p = dummy.next;
					dummy.next = new ListNode((k1+k2)%10+carry);
		            carry = (k1+k2)/10;
					dummy.next.next = p;;
				}
				while(s1.size()>0){
					int k = s1.pop();
					p = dummy.next;
					dummy.next = new ListNode((k + carry)%10+carry);
		            carry = (k + carry)/10;
					dummy.next.next = p;;
				}
				while(s2.size()>0){
					int k = s2.pop();
					p = dummy.next;
					dummy.next = new ListNode((k + carry)%10+carry);
		            carry = (k + carry)/10;
					dummy.next.next = p;;
				}
				while(carry!= 0){
                    p = dummy.next;
					dummy.next = new ListNode(carry%10);
					carry = carry/10;
					dummy.next.next = p;;
                }
				return dummy.next;
		    }
}
