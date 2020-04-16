package GetOfferSolutions;

public class Offer10II {
	/**
	 * 青蛙跳台阶问题
	 * @param n
	 * @return
	 */
	public int numWays(int n) {
		if(n ==0 )
			return 1;
		if(n == 1)
			return 1;
		if(n==2)
			return 2;
		return numWays(n-1) + numWays(n-2);
    }
}
