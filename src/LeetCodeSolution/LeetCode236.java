package LeetCodeSolution;

public class LeetCode236 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// 根节点为空或者根节点是 p 和 q 其中之一则直接返回。
        if(root == null || root == p || root == q) {
            return root;
        }
        // 递归判断 p 和 q 是否在二叉树的一个分支上。
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // left 为 null 表示 p 和 q 在右侧分支上或者二叉树不存在 p 和 q 节点。
        if(left == null) {
            return right;
        }
        // right 为 null 表示 p 和 q 在左侧分支上。
        if(right == null) {
            return left;
        }
        // p 和 q 分属两个分支则返回根节点。
        return root;
        
    }
}
