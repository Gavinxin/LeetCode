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
		int a  =1,b=1;
		for (int i = 0; i < n; i++) {
			int sum = (a+b)%1000000007;
			a = b;
			b = sum;	
		}
		return a;
    }
}
