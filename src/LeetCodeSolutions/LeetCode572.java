package LeetCodeSolutions;

public class LeetCode572 {
	/**
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isSubtree(TreeNode s, TreeNode t) {
        if( s == null)
        	return false;
        return check(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

	private boolean check(TreeNode s, TreeNode t) {
		if(s == null && t ==null) return true;
		if(s==null||t ==null) return false;
		if( t.val == s.val)
			return check(s.left,t.left) && check(s.right,t.right);
		return false;
	}
}
