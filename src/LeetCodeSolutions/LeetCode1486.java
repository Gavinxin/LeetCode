package LeetCodeSolutions;

public class LeetCode1486 {
	/**
	 * 1486. 数组异或操作
	 * @param n
	 * @param start
	 * @return
	 */
	public int xorOperation(int n, int start) {
		int res= start;
		for (int i = 1; i < n; i++) {
			res ^=start+2*i;
		}
		return res;
    }
}
