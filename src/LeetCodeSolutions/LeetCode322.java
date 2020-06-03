package LeetCodeSolutions;

import java.util.Arrays;

public class LeetCode322 {
	/**
	 * 零钱兑换
	 * You are given coins of different denominations and a total amount of money amount. 
	 * Write a function to compute the fewest number of coins 
	 * that you need to make up that amount. 
	 * If that amount of money cannot be made up by any combination of the coins, return -1.
	 * @param coins
	 * @param amount
	 * @return
	 */
	public int coinChange(int[] coins, int amount) {
		//dp数组表示i钱得最少硬币
		int[] dp = new int[amount+1];
		if(coins.length<0)
			return -1;

		Arrays.fill(dp, amount+1);
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < coins.length; j++) {
				if(coins[j]<=i)
					dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
			}
		}
		return dp[amount]>amount?-1:dp[amount];
    }
	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		LeetCode322 l = new LeetCode322();
		System.out.println(l.coinChange(coins, amount));
		
	}
}
