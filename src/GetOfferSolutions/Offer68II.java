package GetOfferSolutions;

import LeetCodeSolutions.TreeNode;

public class Offer68II {
	/**
	 * 面试题68 - II. 二叉树的最近公共祖先
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null )
        	return null;
        if(dfs(root.left,p) && dfs(root.left,q)) return lowestCommonAncestor(root.left,p,q);
        if(dfs(root.right,p) && dfs(root.right,q)) return lowestCommonAncestor(root.right,p,q);
        return root;
    }

	private boolean dfs(TreeNode left, TreeNode q) {
		if(left == null) return false;
		if(left == q) return true;
		return dfs(left.left,q) || dfs(left.right,q);
	}
	
}
