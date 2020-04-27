package GetOfferSolutions;

import GetOfferSolutions.Kth_BST.TreeNode;

public class Offer28 {
	/**
	 * 面试题28. 对称的二叉树
	 * @param root
	 * @return
	 */
	public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }
    boolean recur(TreeNode L, TreeNode R) {
        if(L==null && R==null) return true;
        if(L == null && R!=null || L != null && R==null ||L.val != R.val )  return false;
        return recur(L.left, R.right) && recur(R.left, L.right);
    }
}
