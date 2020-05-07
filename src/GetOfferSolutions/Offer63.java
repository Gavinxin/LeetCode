package GetOfferSolutions;

public class Offer63 {
	/**
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				if(prices[j]>prices[i])
					max =Math.max(max, prices[j]-prices[i]);
			}
		}
		return max;
    }
	public int maxProfit2(int[] prices) {
        int max = 0;
        int cost = Integer.MAX_VALUE;
        for (int price :prices) {
			cost = Math.min(cost, price);
			max = Math.max(max, price-cost);
		}
		return max;
    }
}
