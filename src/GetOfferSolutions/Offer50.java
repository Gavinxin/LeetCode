package GetOfferSolutions;

import java.util.HashMap;

public class Offer50 {
	/**
	 * 面试题50. 第一个只出现一次的字符
	 * @param s
	 * @return
	 */
	public char firstUniqChar(String s) {
		 HashMap<Character, Boolean> dic = new HashMap<>();
	        char[] sc = s.toCharArray();
	        for(char c : sc)
	            dic.put(c, !dic.containsKey(c));
	        for(char c : sc)
	            if(dic.get(c)) return c;
	        return ' ';

    }
	public static void main(String[] args) {
		Offer50 o = new Offer50();
		System.out.println(o.firstUniqChar("cc"));
	}
}
