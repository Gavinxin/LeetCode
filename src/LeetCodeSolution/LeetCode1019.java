package LeetCodeSolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LeetCode1019 {

	public int[] nextLargerNodes(ListNode head) {
		List<Integer> res = new ArrayList<>();
		int i=0;
		while(head!=null) {
			int temp = head.val;
			ListNode p =head.next;
			while(p!=null && p.val<temp ) p= p.next;
			if(p!=null)
				res.add(p.val);
			else res.add(0);
			head= head.next;
		}
		//Integer[] r = res.stream().toArray(Integer[]::new);
		int[] res1= new int[res.size()];
		int j =0;
		for (int r : res) {
			res1[j++] =r;
		}
		return res1;
    }
}
