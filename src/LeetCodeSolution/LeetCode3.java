package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3 {
	/**
	 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		
		int maxlength=0;
		for (int i = 0; i < s.length(); i++) {
			List<Character> list = new ArrayList<>();
			for (int j = i; j <s.length(); j++) {
				if(list.contains(s.charAt(j))) {
					maxlength = Math.max(maxlength, list.size());
					break;
				}
				list.add(s.charAt(j));
			}
		}
		return maxlength;
    }
}
