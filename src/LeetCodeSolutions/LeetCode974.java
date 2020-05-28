package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode974 {
	/**
	 * 974. 和可被 K 整除的子数组
	 * @param A
	 * @param K
	 * @return
	 */
	public int subarraysDivByK(int[] A, int K) {
		 Map<Integer,Integer> map = new HashMap<>();
		 //预先设置前缀和整除的情况
		 map.put(0, 1);
		 int sum= 0;
		 int count = 0;
		 for (int i : A) {
			sum+=i;
			//考虑负数的情况
			int m = (sum%K+K)%K;
			int s = map.getOrDefault(m, 0);
			count +=s;
			map.put(m, s+1);
		}
		return count;
	}
}
