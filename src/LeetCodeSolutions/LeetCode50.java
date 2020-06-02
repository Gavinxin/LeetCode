package LeetCodeSolutions;

public class LeetCode50 {
	/**
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public double myPow(double x, int n) {
		long N = n;
	    return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }
	private double quickMul(double x, long n) {
		if(n==0) return 1;
		double y = quickMul(x, n/2);
		return n%2==0?y*y:y*y*x;
	}
	public static void main(String[] args) {
		System.out.println(Math.pow(2, -1));
	}
}
