package LeetCodeSolution;

import java.util.HashMap;
import java.util.Map;

public class LeetCode105 {
	private Map<Integer,Integer> indexMap;
	/**
	 * 105. ��ǰ��������������й��������
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
		// ǰ������еĵ�һ���ڵ���Ǹ��ڵ�
		 int preorder_root = preorder_left;
		// ����������ж�λ���ڵ�
		 int inorder_root = indexMap.get(preorder[preorder_root]);
		 //�������ڵ�
		 TreeNode root = new TreeNode(preorder[preorder_root]);
		 //z�������нڵ���Ŀ
		 int size_left_subtree = inorder_root-inorder_left;
		 root.left = myBuildTree(preorder, inorder, preorder_left+1, preorder_left+size_left_subtree, preorder_left, inorder_root-1);
		 root.right = myBuildTree(preorder, inorder, preorder_left+1+size_left_subtree, preorder_right, inorder_root+1, inorder_right);
		 return root;
	}
}
