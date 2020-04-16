package GetOfferSolutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTraverse {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	    }
	
	    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	    	
	    	Queue<TreeNode> queue = new LinkedList<>();
	    	 ArrayList<Integer> list = new ArrayList<>();
	    	 if(root == null)
		    		return list;
	    	 queue.offer(root);
	    	 while(!queue.isEmpty()) {
	    		 TreeNode poll =queue.poll();
	    		 if(poll.left!=null)
	    		 queue.offer(poll.left);
	    		 if(poll.right!=null)
	    		 queue.offer(poll.right);
	    		 list.add(poll.val);
	    	 }
			return list;
	    }
}
