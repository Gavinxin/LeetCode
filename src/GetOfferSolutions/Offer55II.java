package GetOfferSolutions;

import LeetCodeSolution.TreeNode;

public class Offer55II {
	/**
	 * 面试题55 - II. 平衡二叉树
	 * @param root
	 * @return
	 */
	public boolean isBalanced(TreeNode root) {
		if(root == null || root.left == null && root.right == null) return true;
		int llevel = level(root.left);
		int rlevel = level(root.right);
		return Math.abs(llevel-rlevel)<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }

	private int level(TreeNode root) {
		if(root == null)
			return 0;
		return 1+Math.max(level(root.right), level(root.left));
	}
}
