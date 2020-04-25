package GetOfferSolutions;

import GetOfferSolutions.Kth_BST.TreeNode;

public class Offer27 {
	/**
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode mirrorTree(TreeNode root) {
		if(root == null )
			return null;
		mirror(root);
		return root;
    }

	private void mirror(TreeNode root) {
		if(root!=null) {
			TreeNode t = root.left;
			root.left = root.right;
			root.right = t;
			mirror(root.left);
			mirror(root.right);
		}
		
	}
}
