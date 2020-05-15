package GetOfferSolutions;

import LeetCodeSolution.TreeNode;

public class Offer68I {
	/**
	 * ������68 - I. �����������������������
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
