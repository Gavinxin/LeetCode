package LeetCodeSolutions;

public class LeetCode124 {
	/**
	 * 124. 二叉树中的最大路径和
	 * @param root
	 * @return
	 */
	int max = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		sum(root);
		return max;	
    }
	private int sum(TreeNode root) {
		if(root == null)
			return  0;
		int L = Math.max(sum(root.left),0);
		int R =  Math.max(sum(root.right),0);
		max = Math.max(R+L+root.val, max);
		return Math.max(L, R)+root.val;
	}
}
