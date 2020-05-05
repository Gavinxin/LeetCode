package LeetCodeSolution;

import java.util.Stack;

public class LeetCode98 {
	/**
	 * 98. ��֤����������
	 * @param root
	 * @return
	 */
	 public boolean isValidBST(TreeNode root) {
			Stack<TreeNode> stack = new Stack<>();
	        if(root==null || root.left == null && root.right==null) return true;
			//long��int���ԱȽ�
	        long pre = Long.MIN_VALUE;
			
			while(stack.size()>0||root!=null) {
				while(root!=null) {
					stack.add(root);
					root = root.left;
				}
				root = stack.pop();
				if(root.val<=pre) return false;
				pre = root.val;
				root = root.right;
				
			}
			return true;
	    }
}
