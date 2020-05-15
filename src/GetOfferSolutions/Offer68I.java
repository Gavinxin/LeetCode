package GetOfferSolutions;

import LeetCodeSolution.TreeNode;

public class Offer68I {
	/**
	 * 面试题68 - I. 二叉搜索树的最近公共祖先
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null ) return null;
        if(root.val < p.val && root.val < q.val)
        	return lowestCommonAncestor(root.right ,p ,q);
        if(root.val > p.val && root.val > q.val)
        	return lowestCommonAncestor(root.left ,p ,q );   
        return root;
    }
}
