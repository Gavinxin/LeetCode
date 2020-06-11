package LeetCodeSolutions;

public class LeetCode1460 {
	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean isPalindrome(int x) {
		if(x<0) return false;
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer();
        return str1.append(x).toString().equals(str2.append(x).toString());
    }
	public static void main(String[] args) {
		LeetCode1460 l = new LeetCode1460();
		System.out.println(l.isPalindrome(10));
	}
}
