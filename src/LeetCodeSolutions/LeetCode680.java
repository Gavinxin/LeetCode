package LeetCodeSolutions;

public class LeetCode680 {
	/**
	 * 680. 验证回文字符串 Ⅱ
	 * @param s
	 * @return
	 */
	public boolean validPalindrome(String s) {
		if(s.length() == 1) return true;
		int l = 0;
		int r = s.length();

		while(l<r && s.charAt(l) == s.charAt(r-1)) {
			l++;
			r--;
		}
		if(l<r)
			return isPalindrome(s.subSequence(l+1, r))||isPalindrome(s.subSequence(l, r-1));
		return true;
    }

	private boolean isPalindrome(CharSequence subSequence) {
		if(subSequence.length() == 1) return true;
		int l = 0;
		int r = subSequence.length();
		while(l<r ) {
			if(subSequence.charAt(l) != subSequence.charAt(r-1))
				return false;
			l++;
            r--;
		}
		return true;
	}
}
