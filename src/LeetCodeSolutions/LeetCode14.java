package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode14 {
	/**
	 * 14. 最长公共前缀
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return  "";
		Arrays.sort(strs);
		StringBuilder sb = new StringBuilder();
		String sFirst = strs[0];
		String sLast = strs[strs.length-1];
		for (int i = 0; i < Math.min(sFirst.length(), strs[strs.length-1].length()); i++) {
			if(sFirst.charAt(i)==sLast.charAt(i))
				sb.append(sFirst.charAt(i));
			else break;
		}
		return sb.toString();
    }
}
