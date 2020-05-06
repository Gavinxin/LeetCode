package GetOfferSolutions;

import LeetCodeSolution.TreeNode;

public class Offer55I {
	/**
	 * 
	 * @param root
	 * @return
	 */
	 public int maxDepth(TreeNode root) {
		 if(root==null)
			 return 0;
		 return depth(root);
	 }

	private int depth(TreeNode root) {
		if(root==null)
			return 0;
		return Math.max(depth(root.left)+1, depth(root.right)+1);
	}
}
