package GetOfferSolutions;

public class Offer66 {
	/**
	 * 面试题66. 构建乘积数组
	 * @param a
	 * @return
	 */
	public int[] constructArr(int[] a) {
		int[] left = new int[a.length]; 
		int[] right = new int[a.length]; 
		int[] b = new int[a.length];
		left[0] = 1;
		for (int i = 1; i < a.length; i++) {
			left[i] = left[i-1]*a[i-1];
		}
		right[a.length-1] = 1;
		for (int i = a.length-2; i>=0; i--) {
			right[i] = right[i+1] * a[i+1];
		}
		b[0] = right[0];
		b[a.length-1] = left[a.length-1];
		for (int i = 1; i < b.length-1; i++) {
			b[i] = left[i]*right[i];
		}
		return b;
    }
}
