package GetOfferSolutions;

import LeetCodeSolutions.TreeNode;

public class Offer54 {
	/**
	 * 
	 * @param root
	 * @param k
	 * @return
	 */
	int res = 0;
	int k;
	public int kthLargest(TreeNode root, int k) {
		this.k = k;
		find(root);
		return res;
    }

	private void find(TreeNode root) {
		if(root == null )
			return ;
		find(root.right);
		if(--k == 0) res = root.val;
		find(root.left);
	}
}
