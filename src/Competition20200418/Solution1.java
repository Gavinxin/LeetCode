package Competition20200418;

public class Solution1 {
	/**
	 * 拿硬币
	 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少
	 * @param coins
	 * @return
	 */
	public int minCount(int[] coins) {
		int cnt =0;
		for (int i = 0; i < coins.length; i++) {
			cnt = coins[i]+1/2;
		}
		return cnt;
    }
}
