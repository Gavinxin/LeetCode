package com.practicetest.yuewen20200519;
import java.util.List;

public class Solution1 {
	/**
	 * ¹ıÂËÄÚÈİÖĞ³öÏÖµÄQQºÅ
	 * 
	 * @param content
	 *            string×Ö·û´® ´ı¹ıÂËÄÚÈİ
	 * @return string×Ö·û´®
	 */
	public String filterContent(String content) {
		int start = 0;
		int end = 0;
		int[] ij = find(content);
		while(ij!=null) {
			content = content.substring(0,ij[0])+content.substring(ij[1]);
			ij = find(content);
		}
		return content;
	}

	public int[] find(String content) {
		for (int i = 0; i < content.length(); i++) {
			if (Character.isDigit(content.charAt(i))&&content.charAt(i)!='0') {
				int j = i + 1;
				for (; j < content.length(); j++) {

					if (!Character.isDigit(content.charAt(j)))
						break;
				}
				if(j-i>=6&&j-i<=10)
					return new int[] {i,j};
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Solution1 s= new Solution1();
		System.out.println(s.filterContent("12345678¹ş¹ş"));
	}
}
