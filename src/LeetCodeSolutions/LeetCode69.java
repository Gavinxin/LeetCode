package LeetCodeSolutions;

public class LeetCode69 {
	/**
	 * 69. x 的平方根
	 * 换底 e 1/2 lnx
	 * @param x
	 * @return
	 */
	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		int ans = (int) Math.exp(0.5 * Math.log(x));
		return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
	}
}
