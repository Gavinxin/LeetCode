package LeetCodeSolutions;

public class LeetCode112 {
	/**
	 * 112. Â·¾¶×ÜºÍ
	 * @param root  
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
