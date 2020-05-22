package LeetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class LeetCode105 {
	private Map<Integer,Integer> indexMap;
	/**
	 * 105. 从前序与中序遍历序列构造二叉树
	 * @param preorder
	 * @param inorder
	 * @return
	 */
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int n = preorder.length;
		indexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; i++) {
			indexMap.put(inorder[i], i);
		}
		return myBuildTree(preorder,inorder,0,n-1,0,n-1);
    }
	private TreeNode myBuildTree(int[] preorder,int[] inorder,int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
		if(preorder_left>preorder_right)
			return null;
		// 前序遍历中的第一个节点就是根节点
		 int preorder_root = preorder_left;
		// 在中序遍历中定位根节点
		 int inorder_root = indexMap.get(preorder[preorder_root]);
		 //建立根节点
		 TreeNode root = new TreeNode(preorder[preorder_root]);
		 //z左子树中节点数目
		 int size_left_subtree = inorder_root-inorder_left;
		 root.left = myBuildTree(preorder, inorder, preorder_left+1, preorder_left+size_left_subtree, preorder_left, inorder_root-1);
		 root.right = myBuildTree(preorder, inorder, preorder_left+1+size_left_subtree, preorder_right, inorder_root+1, inorder_right);
		 return root;
	}
}
