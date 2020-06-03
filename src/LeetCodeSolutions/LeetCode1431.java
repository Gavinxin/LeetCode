package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
	/**
	 * 1431. 拥有最多糖果的孩子
	 * @param candies
	 * @param extraCandies
	 * @return
	 */
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<Boolean>();
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			max =Math.max(max, candies[i]);
		}
		for (int i = 0; i < candies.length; i++) {
			res.add(candies[i]+extraCandies>=max);
		}
		return res;
    }
}
