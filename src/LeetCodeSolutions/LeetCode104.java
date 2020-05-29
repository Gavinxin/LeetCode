package LeetCodeSolutions;

public class LeetCode104 {
	/**
	 * 
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if(root == null ) return 0;
		return deep(root);
    }

	private int deep(TreeNode node) {
		if(node == null)
			return 0;
		return Math.max(1+deep(node.left), 1+deep(node.right));
	}
}
