package LeetCodeSolution;

public class LeetCode236 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// ���ڵ�Ϊ�ջ��߸��ڵ��� p �� q ����֮һ��ֱ�ӷ��ء�
        if(root == null || root == p || root == q) {
            return root;
        }
        // �ݹ��ж� p �� q �Ƿ��ڶ�������һ����֧�ϡ�
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // left Ϊ null ��ʾ p �� q ���Ҳ��֧�ϻ��߶����������� p �� q �ڵ㡣
        if(left == null) {
            return right;
        }
        // right Ϊ null ��ʾ p �� q ������֧�ϡ�
        if(right == null) {
            return left;
        }
        // p �� q ����������֧�򷵻ظ��ڵ㡣
        return root;
        
    }
}
