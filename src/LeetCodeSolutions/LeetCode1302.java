package LeetCodeSolutions;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1302 {
	/**
	 * 1302. ��������Ҷ�ӽڵ�ĺ͸���һ�ö����������㷵�ز��������Ҷ�ӽڵ�ĺ͡�
	 * @param root
	 * @return
	 */
	 public int deepestLeavesSum(TreeNode root) {
		 if(root == null)
			 return 0;
		 Queue<TreeNode> queue = new LinkedList<>();
		 queue.add(root);
		 int sum = 0;
		 while(queue!=null && queue.size()>0) {
			 int size = queue.size();
			 sum = 0;
			 for (int i = 0; i < size; i++) {
				 TreeNode t = queue.poll();
				 sum+=t.val;
				 if(t.left!=null)
					 queue.add(t.left);
				 if(t.right!=null)
					 queue.add(t.right);
			}
		 }
		 return sum;
	 }
}
