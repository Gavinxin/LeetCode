package LeetCodeSolutions;

import java.util.HashSet;

public class LeetCode983 {
	/**
	 * 983. 最低票价
	 * 
	 * @param days
	 * @param costs
	 * @return
	 */
	public int mincostTickets(int[] days, int[] costs) {
		if (days.length == 0)
			return 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer day : days) {
			set.add(day);
		}
		// 第i天的所需最低票价
		int[] dp = new int[days[days.length - 1] + 1];
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) {
			if (!set.contains(i)) {
				dp[i] = dp[i - 1];
				continue;
			}
			if(i>=30)
				dp[i] = Math.min(Math.min(dp[i-30]+costs[2], dp[i-7]+costs[1]), dp[i-1]+costs[0]);
			else if(i>=7)
				dp[i] = Math.min(Math.min(dp[i-1]+costs[0], dp[i-7]+costs[1]), costs[2]);
			else if(i>=1)
				dp[i] = Math.min(Math.min(costs[1], costs[2]), dp[i-1]+costs[0]);
		}
		return dp[dp.length-1];
	}
}
