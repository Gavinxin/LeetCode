package GetOfferSolutions;

public class Offer58II {
	/**
	 * ������58 - II. ����ת�ַ���
	 * @param s
	 * @param n
	 * @return
	 */
	public String reverseLeftWords(String s, int n) {
		return new StringBuilder(s.substring(n)).append(s.subSequence(0, n)).toString();
    }
}
