package GetOfferSolutions;

public class Offer64 {
	/**
	 * ������64. ��1+2+��+n
	 * @param n
	 * @return
	 */
	public int sumNums(int n) {
		boolean flag = n>1 && (n+=sumNums(n-1))>0;
		return n;
    }
}
