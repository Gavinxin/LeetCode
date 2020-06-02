package LeetCodeSolutions;

public class LeetCode101 {
	/**
	 * 101. ¶Ô³Æ¶þ²æÊ÷
	 * @param root
	 * @return
	 */
	public boolean isSymmetric(TreeNode root) {
        if(root==null)
        	return true;
        return Symmetric(root.left,root.right);
    }

	private boolean Symmetric(TreeNode left, TreeNode right) {
		if(left ==null && right == null)
			return true;
		if(left == null || right == null )
			return false;
		return left.val==right.val&&Symmetric(left.left,right.right )&&Symmetric(left.right, right.left);
	}
}
