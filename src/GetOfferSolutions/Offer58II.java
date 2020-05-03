package GetOfferSolutions;

public class Offer58II {
	/**
	 * ÃæÊÔÌâ58 - II. ×óĞı×ª×Ö·û´®
	 * @param s
	 * @param n
	 * @return
	 */
	public String reverseLeftWords(String s, int n) {
		return new StringBuilder(s.substring(n)).append(s.subSequence(0, n)).toString();
    }
}
