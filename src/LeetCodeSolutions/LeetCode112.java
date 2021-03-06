package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode112 {
	/**
	 * 112. ·���ܺ�
	 * @param root  
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
		Map<Integer,Integer> map =new HashMap<>();
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
