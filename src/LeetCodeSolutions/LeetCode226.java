package LeetCodeSolutions;

public class LeetCode226 {
	/**
	 * 226. ·­×ª¶þ²æÊ÷
	 * @param root
	 * @return
	 */
	public TreeNode invertTree(TreeNode root) {
		if(root == null) return null;
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
    }
}
