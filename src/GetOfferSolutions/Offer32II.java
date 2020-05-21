package GetOfferSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import GetOfferSolutions.Kth_BST.TreeNode;

public class Offer32II {
	/**
	 * 面试题32 - II. 从上到下打印二叉树 II
	 * @param root
	 * @return
	 */
	public int[] levelOrder(TreeNode root) {
		List<Integer> res= new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if(root == null) return new int[0] ;
		queue.add(root);
		while(queue.size()>0) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode t = queue.poll();
				res.add(t.val);
				if(t.left!=null)
					queue.add(t.left);
				if(t.right!=null)
					queue.add(t.right);
			}
			
		}
		Integer[] obj = res.toArray(new Integer[res.size()]);
		Arrays.stream(obj).mapToInt(Integer::valueOf).toArray();
		return res.stream().mapToInt(v->v.intValue()).toArray();
    }
}
