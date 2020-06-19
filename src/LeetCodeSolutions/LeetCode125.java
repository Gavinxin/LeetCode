package LeetCodeSolutions;

public class LeetCode125 {
	/**
	 * 125. 验证回文串
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i)))
				sb.append(s.charAt(i));
		}
		return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}
