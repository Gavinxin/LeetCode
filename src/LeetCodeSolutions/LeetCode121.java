package LeetCodeSolutions;

public class LeetCode121 {
	/**
	 * 121. 买卖股票的最佳时机
	 * @param prices
	 * @return
	 */
	 public int maxProfit(int[] prices) {
		 int max = 0;
		 for (int i = 1; i < prices.length; i++) {
			for (int j = 0; j < i; j++) {
				if(prices[i]>prices[j])
					max = Math.max(max, prices[i]-prices[j]);
			}
		}
		return max;
	 }
}
