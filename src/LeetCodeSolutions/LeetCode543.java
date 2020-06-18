package LeetCodeSolutions;

public class LeetCode543 {
	/**
	 * 543. ¶þ²æÊ÷µÄÖ±¾¶
	 * @param root
	 * @return
	 */
	int res = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		depth(root);
		return res;
    }

	private int depth(TreeNode root) {
		if(root == null)
			return 0;
		int L = depth(root.left);
		int R = depth(root.right);
		res = Math.max(L+R, res);
		return Math.max(L, R)+1;
	}
}
