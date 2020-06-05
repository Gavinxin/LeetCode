package LeetCodeSolutions;

public class LeetCode461 {
	/**
	 * 461. 汉明距离
	 * @param x
	 * @param y
	 * @return
	 */
	public int hammingDistance(int x, int y) {
		//先异或 再统计1的个数
		return Integer.bitCount(x^y);
    }
}
