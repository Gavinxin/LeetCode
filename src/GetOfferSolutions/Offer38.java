package GetOfferSolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Offer38 {
	/**
	 * 面试题38. 字符串的排列
	 */
	Set<String> res = new HashSet<>();
	public String[] permutation(String s) {
		if(s.length()==0) return new String[0];
		HashSet<Integer> set = new HashSet<>();
		permute(s,"",set);
		return res.stream().toArray(String[]::new);
    }
	private void permute(String s, String string, HashSet<Integer> set) {
		if(s.length() == set.size()) {
			res.add(string);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!set.contains(i)) {
				set.add(i);
				permute(s,string+c,set);
				set.remove(i);
			}
		}
		
	}
	
}
