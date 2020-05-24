package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode872 {
	/**
	 * 872. Ҷ�����Ƶ��� �뿼��һ�Ŷ����������е�Ҷ�ӣ���ЩҶ�ӵ�ֵ�������ҵ�˳�������γ�һ�� Ҷֵ���� ��
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		dfs(root1, list1);
		dfs(root2, list2);
		return list1.equals(list2);
	}

	private void dfs(TreeNode root1, List<Integer> list1) {
		if(root1!=null) {
			if(root1.left == null &&root1.right == null)
				list1.add(root1.val);
			dfs(root1.left,list1);
			dfs(root1.right,list1);
		}

	}
}
