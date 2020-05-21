package LeetCodeSolution;

public class LeetCode5 {
	/**
	 * 5. 最长回文子串
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		if(s.length()==0 || s == null) return "";
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int l1 = Palindrome(s,i,i);
			int l2 = Palindrome(s,i,i+1);
			int len = Math.max(l1, l2);
			if(len>end-start) {
				start = i-(len-1)/2;
				end = i+len/2;
			}
		}
		return s.substring(start,end+1);
    }

	private int Palindrome(String s, int i, int i2) {
		// TODO Auto-generated method stub
		while(i>=0&&i2<=s.length()-1&&s.charAt(i) == s.charAt(i2)) {
			i--;
			i2++;
		}
		return i2-i-1;
	}

	
}
