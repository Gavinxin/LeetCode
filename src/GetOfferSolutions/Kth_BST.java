package GetOfferSolutions;

import java.util.ArrayList;
import java.util.List;

public class Kth_BST {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	List<TreeNode> list = new ArrayList<Kth_BST.TreeNode>();
	TreeNode KthNode(TreeNode pRoot, int k)
    {	
		avgTra(pRoot);
        return list.size()>k?list.get(k-1):null;
    }
	
	void avgTra(TreeNode pRoot){
		
		avgTra(pRoot.left);
		list.add(pRoot);
		avgTra(pRoot.right);
	}
}
