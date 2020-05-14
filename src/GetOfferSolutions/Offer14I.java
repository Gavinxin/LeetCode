package GetOfferSolutions;

public class Offer14I {
	/**
	 * ÃæÊÔÌâ14- I. ¼ôÉş×Ó
	 * @param n
	 * @return
	 */
	public int cuttingRope(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			if(i!=n)
				dp[i] = i;
			for (int j = 1; j < i/2+1; j++) {
				dp[i] = Math.max(dp[i], dp[j]*dp[i-j]);
			}			
		}
		return dp[n];
    }
	public static void main(String[] args) {
		Offer14I o =new Offer14I();
		System.out.println(o.cuttingRope(10));
	}
}
