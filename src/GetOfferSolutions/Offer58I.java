package GetOfferSolutions;

public class Offer58I {
	/**
	 * ������58 - I. ��ת����˳��
	 * @param s
	 * @return
	 */
	public String reverseWords(String s) {
		String[] str = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = str.length-1; i >=0; i--) {
			sb.append(str[i].trim());
			sb.append(" ");
		}
		return sb.toString().trim();
    }
}
